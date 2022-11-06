package org.binar.view;

import java.util.Scanner;

public class View {
    public int getMenu(String fileName, String direktori) {
        System.out.println("==============================");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("==============================");
        System.out.println("Letakan file csv dengan nama file " + fileName + " di direktori berikut:\n"
                + direktori);

        int menu;
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("Menu");
        System.out.println("1. Generate txt untuk menampilkan Modus Frekuensi");
        System.out.println("2. Generate txt untuk menampilkan Mean, Median dan Modus (Pemusatan Data)");
        System.out.println("3. Generate Keduanya");
        System.out.println("0. Exit");
        System.out.print("Pilih Menu \t: ");
        menu = input.nextInt();
        System.out.println();
        return menu;
    }

    public void subMenu() {
        int menu;
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("0. Exit");
        System.out.println("1. Kembali ke menu utama");
        System.out.print("Pilih Menu \t: ");
        menu = input.nextInt();
        System.out.println();
        switch (menu) {
            case 1:
                break;
            case 0:
                System.out.println("Aplikasi ditutup. Terimakasih!");
                System.exit(0);
                break;
            default:
                System.out.println("Pastikan inputanmu sesuai!");
        }
    }

}
