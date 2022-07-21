package com.javasimple.linkedlists;

public class Link {
  public String bookName;
  public int millionsSold;

  public Link next;

  public Link(String bookName, int millionsSold) {
    this.bookName = bookName;
    this.millionsSold = millionsSold;
  }

  public void display() {
    System.out.println(bookName + ": " + millionsSold + " millions");
  }

  public String toString() {
    return bookName;
  }

  public static void main(String[] args) {

    LinkedList theLinkedList = new LinkedList();

    theLinkedList.insertFirstLink("Don Quixote", 500);
    theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
    theLinkedList.insertFirstLink("Harry Potter", 900);

    theLinkedList.display();

  }
}

class LinkedList {
  public Link firstLink;

  LinkedList() {
    firstLink = null;
  }

  public boolean isEmpty() {
    return (firstLink == null);
  }

  public void insertFirstLink(String bookName, int millionsSold) {
    Link newLink = new Link(bookName, millionsSold);
    newLink.next = firstLink;
    firstLink = newLink;
  }

  public Link removeFirst() {
    Link linkReference = firstLink;
    if (!isEmpty()) {
      firstLink = firstLink.next;
    } else {
      System.out.println("List is empty");
    }
    return linkReference;
  }

  public void display() {
    Link theLink = firstLink;
    while (theLink != null) {
      theLink.display();
      theLink = theLink.next;
    }
  }

  public Link find(String bookName) {
    Link theLink = firstLink;
    if (!isEmpty()) {
      while (theLink.bookName != bookName) {
        if (theLink.next == null) {
          return null;
        } else {
          theLink = theLink.next;
        }
      }
    } else {
      System.out.println("List is empty");
    }
    return theLink;
  }

  public Link removeLink(String bookName) {
    Link currentLink = firstLink;
    Link previousLink = firstLink;

    while (currentLink.bookName != bookName) {
      if (currentLink.next == null) {
        return null;
      } else {
        previousLink = currentLink;
        currentLink = currentLink.next;
      }
    }
    if (currentLink == firstLink) {
      firstLink = firstLink.next;
    } else {
      previousLink.next = currentLink.next;
    }
    return currentLink;
  }
}
