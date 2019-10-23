package com.exercise22ocurrences.app;
import java.util.Random;
import java.util.HashMap;

public class OcurrencesApp 
{
	public static void main(String[]arg)
	{
	//constantes
	final int ELEMENTS= 10000;
	
	
	Random numbers= new Random(System.nanoTime());
	HashMap <Integer,Integer>miHash= new HashMap<Integer,Integer>();
	
	
	int []miArray = new int [ELEMENTS];
	
	for(int i=0;i<ELEMENTS;i++)
	{
	miArray[i]= numbers.nextInt(101);
	}
	
	
	//se muestra el vector con un for each
	//por cada elemento i que esta en el vector miArray se imprime el elemento
	for (int i: miArray)
	{
		System.out.println(" "+i);
	}
	
	//proceso
	int ocurrences=0;
	for (int element: miArray)
	{
		if(miHash.containsKey(element))
		{
			ocurrences = miHash.get(element);
			ocurrences++;
			miHash.put(element, ocurrences);
		}
		else
		{
			miHash.put(element, 1);
		}
		
		miHash.putIfAbsent(element, 1);
	}
	
	System.out.println(miHash);
	for (int i: miArray)
	{
		System.out.println(" "+i);
	}
	
	}
	
}
