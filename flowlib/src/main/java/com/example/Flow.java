package com.example;




public class Flow {
    public static void main (String[] args) {
        int gameNumber = 5;

        if (gameNumber >= 1 && gameNumber <= 5) {
            System.out.println("You're a Casual Gamer.");
        }
            else if (gameNumber >= 5 && gameNumber <= 10) {
            System.out.println("You Are a Hard Core Gamer.");
        }

                else if (gameNumber >= 10 && gameNumber <= 20) {
            System.out.println("You Need to Take a Break, Seriously.");
        }

        else{
            System.out.println("Try Some Games.");
                    }

                }
            }