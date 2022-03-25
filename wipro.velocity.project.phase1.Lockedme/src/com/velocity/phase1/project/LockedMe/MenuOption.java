package com.velocity.phase1.project.LockedMe;

import java.io.*;
import java.util.*;
import java.nio.*;

public class MenuOption {
	public void MenuOption ()
	{
	
	    System.out.println("\n========================Main Menu===============================");
	    System.out.printf("\n1. Retrive Files in the Folder  \n2. File Menu Options  \n0. Exit \n");
	    int input=-1;
		do
		{
Scanner sc=new Scanner(System.in);
System.out.println("\n ****Enter your option from the above Main  Menu:****");
	input = sc.nextInt();
switch(input)
{
case 1:
//arrange files in assending order
Scanner S1=new Scanner(System.in);
System.out.println("================Enter The Your Directory Name ================  ");
String Dir1=S1.nextLine();
Dir1.toLowerCase();
List(Dir1);

break;
case 2:
FileOption lf=new FileOption();
lf.FileOption();
break;
default:

        System.out.println("****Thanks For for using LOCKEDME****");
		System.out.println("-----------Visit Again!!------------");	
}

}while(input!=0);
}

static void List(String Dir1)
{
File dir = new File(Dir1);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                // Check if the file is a directory
                if (file.isDirectory()) {
                    System.out.println(file.getAbsolutePath());
                } else {
                    // We can use .length() to get the file size
                    System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
                }
            }
}
else
{
	System.out.println("******ERROR*****");
System.out.println("The Directory not found");
}
}

}
