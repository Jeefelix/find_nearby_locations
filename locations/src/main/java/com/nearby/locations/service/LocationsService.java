package com.nearby.locations.service;

import java.util.Scanner;

public class LocationsService {

    public int[][] findByLocation() {

        int x,y, clientLocation[][] = new int [1][2];
        int m,n, plano[][] = new int [1][2];;
        int lojas[][] = {{40,88},{18,56}, {99,02}};
        Scanner readLocation = new Scanner(System.in);

        for (m=0; m<1; m++) {
            System.out.printf("Informe as coordenadas máximas de X e Y, nesta ordem, do plano: \n", (m+1));
            for (n=0; n<2; n++)
                System.out.printf("plano [%d][%d] = ", m, n);
                plano[m][n] = readLocation.nextInt();
        }

        for (x=0; x<1; x++) {
            System.out.printf("Informe as coordenadas X e Y, nesta ordem, do seu local: \n", (x+1));
            for (y=0; y<2; y++)
            System.out.printf("coordenadas do cliente [%d][%d] = ", x, y);
            clientLocation[x][y] = readLocation.nextInt();
        }

        return clientLocation;

    }
}
