package com.jspiders.musicplayer.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.musicplayer.operations.SongOperation;
//import com.jspiders.musicplayercasestudy.song.Song;
//import com.jspiders.musicplayercasestudy.song.songoperations;

public class MusicPlayer
{

	public static void main(String[] args)
	{

          musicPlayer();
	}


	public static void musicPlayer()
	{


		SongOperation song=new SongOperation();
		Scanner scanner=new Scanner(System.in);
	     	System.out.println("@@@@@@@@Music Player@@@@@@");
		    System.out.println("Menu");
			System.out.println("1.Play songs ");
			System.out.println("2.Add/Remove");
			System.out.println("3.Edit");
			System.out.println("4.Exit");
		boolean loop=true;


	   while(loop==true)
	   {

			int choice=scanner.nextInt();
		   switch(choice)
		   {

		   case 1:
		   {
		   System.out.println("@@@@@@@@Play Songs@@@@@@");
		   System.out.println("1.Play all songs");
		   System.out.println("2.Choose song to play ");
		   System.out.println("3.Play random song");
		   System.out.println("4.Go back");
		           int i=scanner.nextInt();

		           switch(i)
		           {  case 1:song.playallsongs();
		                    musicPlayer();
		           
		                    break;
		              case 2:song.choosesong();
		                    musicPlayer();
		                    break;
		              case 3:song.randomSongs();
		                    musicPlayer();
		                    break;
		              case 4: musicPlayer();
		              break;
		           }

		   }
		   break;

		   case 2:
		   {
			   System.out.println("@@@@@@@@Add/Remove@@@@@@");
			   System.out.println("1.Add song");
			   System.out.println("2.Remove song");
			   System.out.println("3.Go back");
			   int p=scanner.nextInt();

			   switch(p)
	           {  case 1:song.addSongs();
	                 musicPlayer();
	                    break;
	              case 2:song.removeSongs();
	                    musicPlayer();
	                    break;
	              case 3:musicPlayer();
	                    break;

	           }
	       }
		   break;

		   case 3:
		   {
				System.out.println("1.Edit details\n" + "2.Go Back\n");


			   int p1=scanner.nextInt();


			   switch(p1)
			  {
			      case 1:song.editsong();
			             break;
	              case 2: musicPlayer();
	              break;
	           }
		}
		   break;



		   case 4:

		   {

			   System.out.println("@@@@@Thank you@@@@@");

		   }
		   break;

		   default:System.out.println("Invalid Choice");
		   musicPlayer();
		   }
		   loop=false;


	   }

	}
}
