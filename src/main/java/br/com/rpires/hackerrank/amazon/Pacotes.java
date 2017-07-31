package br.com.rpires.hackerrank.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Fazer um programa para calcular a quantidade de entregas a serem feitas:
 * entrada: 100 peso maximo
 * quantiade de pacotes:
 * 
 * 
 */
public class Pacotes {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tripMaxWeight = in.nextInt();
        int numberOfPackages = in.nextInt();

        int[] packagesWeight = new int[numberOfPackages];

        for (int i = 0; i < numberOfPackages; i++) {
            packagesWeight[i] = in.nextInt();
        }

        int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);

        System.out.println(minimumNumberOfTrips);
    }
	
	static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		 List<Integer> listpackagesWeight = new ArrayList<Integer>();
		 for(int i = 0 ; i < packagesWeight.length; i++) {
			 listpackagesWeight.add(packagesWeight[i]);
		 }
		 
		 int countTotalTrips = 0;
		 boolean count100 = false;
		 int j = 0;
		 for (int i = 0; i < listpackagesWeight.size(); i++) {
			 count100 = false;
			 for (j = i+1; j < listpackagesWeight.size(); j++) {
				 int wei1 = listpackagesWeight.get(i);
				 int wei2 = listpackagesWeight.get(j);
				 if (wei1 == 100) {
					 countTotalTrips++;
					 count100 = true;
					 break;
				 } else {
					 int wei3 = wei1 + wei2;
					 if (wei3 == 100) {
						 countTotalTrips++;
						 count100 = true;
					 } else if (wei3 <= 100) {
						 countTotalTrips++;
						 listpackagesWeight.remove(j);
						 count100 = true;
					 }
				 }
			 }
			 if (!count100) {
				 countTotalTrips++;
				 //listpackagesWeight.remove(j);
				 count100 = false;
			 }
		 }
		return countTotalTrips;

    }
}
