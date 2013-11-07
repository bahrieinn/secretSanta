package com.brianctong;
import java.util.*;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args){
    final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
    SecretSanta xmas = new SecretSanta();
    final String[] assignments = xmas.generateAssignments(participants);

    System.out.println("Participants: " + Arrays.toString(participants));
    System.out.println(" Assignments: " + Arrays.toString(assignments));
  } 

} 
