package com.jspiders.musicplayer.operations;
import java.util.ArrayList;
import java.util.Scanner;
import com.jspiders.musicplayer.entity.Song;

public class SongOperation {
	static Song s = new Song();
	static ArrayList<Song> a= new ArrayList<>();
	static Scanner sc= new Scanner(System.in);
	public void playallsongs()
	{

		        System.out.println("@@Playing all songs@@");
		        for (int i = 0; i < a.size(); i++)
		        {
		            System.out.println(a.get(i));
		        }
	}

	public void choosesong()
	{

		System.out.println(a);
	 }

	public void randomSongs()
	{
		System.out.println(a);

	}

	public void addSongs()
	{

	   System.out.println("Enter song sequence");
	   int s0=sc.nextInt();

	   System.out.println("Enter song name");
	   String s1=sc.nextLine();
	   sc.nextLine();
	   System.out.println("Enter singer name");
	   String s2=sc.nextLine();

	   System.out.println("Enter song duration");
	   double s3=sc.nextDouble();



	   Song sa = new Song(s0,s1, s2, s3);
       a.add(sa);
       System.out.println("**Song Add successful**");


	}

	public void removeSongs()
	{
		 System.out.println("Enter song sequence to remove it");
	        int songnum = sc.nextInt();
	        a.remove(songnum-1);
	        System.out.println("**Song remove successful**");

	}

	public void editsong()
	{

		System.out.println("Enter the song number to edit the details");
		int choice2=sc.nextInt();
        System.out.println("Enter number in sequence");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter song name");
        String n = sc.nextLine();
        System.out.println("Enter duration");
        double d = sc.nextDouble();
        System.out.println("enter singer");
        String sn = sc.nextLine();
        a.get(choice2-1).setNumber(num);
        a.get(choice2-1).setSong(n);
        a.get(choice2-1).setDuration(d);
        a.get(choice2-1).setSinger(sn);
        System.out.println("Song edited succesfully");
	}
}
