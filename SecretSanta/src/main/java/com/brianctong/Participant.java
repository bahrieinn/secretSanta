package com.brianctong;

import java.io.*;

public class Participant {
  String firstName;
  boolean receivingGift;

  Participant(String firstName){
    this.firstName = firstName;
    this.receivingGift = false;
  }
}