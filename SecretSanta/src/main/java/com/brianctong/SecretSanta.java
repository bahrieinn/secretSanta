package com.brianctong;

import java.util.*;
import java.io.*;

public class SecretSanta {
  
  public String[] generateAssignments(final String[] participants) {
    String[] assignments = new String[participants.length];
    Participant[] participantArray = this.generateParticipants(participants);
    String errorMessage = "Sorry but you need at least 3 people to have a Secret Santa";
    
    /* Catch edge cases */
    if (participantArray.length < 3) {
      System.out.println(errorMessage);
      return assignments;
    }

    for (int i = 0; i < participantArray.length; i++) {
      ArrayList<Participant> currentPool = this.determinePool(participantArray[i], participantArray);
    
      /* If remaining pool is [Brian, Stan] and the next person is Stan
       * then Stan MUST be selected THIS turn so that Stan doesn't end with a pool of [Stan]
       */
      if (currentPool.size() == 2 && currentPool.contains(participantArray[i+1])) {
        assignments[i] = participantArray[i+1].firstName;
        participantArray[i+1].receivingGift = true;
      } else {
        Participant randomParticipant = currentPool.get(randomGenerator(currentPool.size()));
        assignments[i] = randomParticipant.firstName;
        randomParticipant.receivingGift = true;
      }
    }
    return assignments;
  }

  /* Parse string array into more meaningful array of Participant objects */
  private Participant[] generateParticipants(final String[] participants) {
    Participant[] parsedParticipants = new Participant[participants.length];
    for (int i = 0; i < participants.length; i++) {
      parsedParticipants[i] = new Participant(participants[i]);
    } 
    return parsedParticipants;
  }

  /* Determines the pool of viable recipients based on:
   * 1. Recipient can't be the giver himself/herself
   * 2. Recipient can't be someone who is already getting a gift (i.e. Participant.receivingGift == true)
   */
  private ArrayList<Participant> determinePool(Participant giver, final Participant[] participants) {
    ArrayList<Participant> viableRecipients = new ArrayList<Participant>();
    for (int i = 0; i < participants.length; i++) {
      if ( (participants[i].firstName != giver.firstName) && (participants[i].receivingGift == false) ) {
        viableRecipients.add(participants[i]);
      }
    }
    return viableRecipients;
  }

  /* Simple tool to generate a random number within a range of 0..(max-1) */
  private int randomGenerator(final int max) {
    Random randomizer = new Random();
    int randomNumber = randomizer.nextInt(max);
    return randomNumber;
  }
}

