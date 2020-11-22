package com.boraozgur.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Album FirstAlbum = new Album("Stormbringer", "Deep Purple");
		FirstAlbum.addSong("Stormbringer", 4.6);
		FirstAlbum.addSong("Holy Man", 4.7);
		FirstAlbum.addSong("Hold on", 4.8);

		albums.add(FirstAlbum);

		Album secondAlbum = new Album("For those about to rock", "AC/DC");
		secondAlbum.addSong("Showballed", 3.4);
		secondAlbum.addSong("C.O.D", 3.4);
		secondAlbum.addSong("Breaking the rules", 3.4);
		albums.add(secondAlbum);

		LinkedList<Song> playlist = new LinkedList<Song>();

		albums.get(0).addToPlayList("Stormbringer", playlist);
		albums.get(0).addToPlayList("Holy Man", playlist);
		albums.get(1).addToPlayList("C.O.D", playlist);
		albums.get(1).addToPlayList("Q.Q.Q", playlist);

		play(playlist);

	}

	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = false;
		ListIterator<Song> listIterator = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing" + listIterator.next().toString());
			printMenu();
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now playing" + listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing" + listIterator.previous().toString());
				} else {
					System.out.println("We are at the start of the playlist");
					forward = false;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now replaying"+ listIterator.previous().toString());
						forward = false ;
					}else {
						System.out.println("We are at the start of the list");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying "+listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("we have reached end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0 ) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing "+ listIterator.next());
					}else if(listIterator.hasPrevious()) {
						System.out.println("Now playing"+ listIterator.previous());
					}
				}
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" 
						   +"1 - to play next song\n"
						   +"2 - to play previous song\n"
						   +"3 - to replay the current song\n"
						   +"4 - list songs in the playList\n"
						   +"5 - print available actions"
						   +"6 - delete current song from playlist");	
	}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("===================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===================");
	}
	
	

}
