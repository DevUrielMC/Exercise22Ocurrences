package com.exercise22ocurrences.app;
import java.util.Random;
import java.util.HashMap;

public class OcurrencesApp 
{
	public static void main(String[] args) {
		//Constants declaration
		final int ELEMENTS=10;

		//Variables declaration

		//Objects declaration
		//Scanner input = new Scanner(System.in);
		Random numbers= new Random(System.nanoTime());
		HashMap<Integer, Integer> miHash = new HashMap<Integer, Integer>();

		//Initialization
		int[] miArray = new int[ELEMENTS];
		for(int i=0;i<ELEMENTS;i++)
		{
			miArray[i] = numbers.nextInt(5);
		}

		//Process
		//int ocurrences=0;
		for(int element:miArray) 
		{
			//ocurrences=0;
			if(miHash.containsKey(element))
			{
				//ocurrences = miHash.get(element);
				//ocurrences++;
				miHash.put(element,miHash.get(element)+1);
			}
			else
			{
				miHash.put(element,1);
			}
			/*
			miHash.putIfAbsent(element, 1);*/
		}
		System.out.println(miHash);

		for(int i:miArray)
		{
			System.out.print(" "+i);
		}
		//input.close();

	}

}
