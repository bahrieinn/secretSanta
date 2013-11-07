package com.brianctong;

import java.util.*;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  
  final String[] evenParticipants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
  final String[] oddParticipants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie" };
  final String[] singleParticipant = new String[] { "Kyle" };
  final String[] zeroParticipants = new String[] {};

  SecretSanta testSecretSanta = new SecretSanta();

  final String[] oddAssignments = testSecretSanta.generateAssignments(oddParticipants);
  final String[] evenAssignments = testSecretSanta.generateAssignments(evenParticipants);

  /* Given Even # of Participants */
  @Test  
  public void testEvenAssignmentLength(){
    assertEquals(evenParticipants.length, evenAssignments.length);
  }

  @Test
  public void testEvenValidAssignments(){
    for (int i = 0; i < evenAssignments.length; i++) {
      assertNotSame(evenParticipants[i], evenAssignments[i]);
    }
  }

  /* Given Odd # of Participants */
  @Test  
  public void testOddAssignmentLength(){
    assertEquals(oddParticipants.length, oddAssignments.length);
  }

  @Test
  public void testOddValidAssignments(){
    for (int i = 0; i < oddAssignments.length; i++) {
      assertNotSame(oddParticipants[i], oddAssignments[i]);
    }
  }

  /* Given Only 1 Participant */
  @Test
  public void testSingleParticipant(){
    final String[] singleAssignments = testSecretSanta.generateAssignments(singleParticipant);
    final String[] nullArray = new String[] {null};
    assertArrayEquals(nullArray, singleAssignments);
  }

  /* Given no Participants */
  @Test
  public void testZeroParticipants(){
    final String[] zeroAssignments = testSecretSanta.generateAssignments(zeroParticipants);
    final String[] emptyArray = new String[] {};
    assertArrayEquals(emptyArray, zeroAssignments);
  }
}

