/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatureclothingadvice;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class TemperatureClothingAdvice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //getting user input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter Temperature in Celsius: ");
        double temperature = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Special weather conditions (rain, wind, or clear): ");
        String specialWeather = sc.nextLine();
        
        //determine clothing recommendation
        String tempClothing = "";
        if (temperature <= 0){
            tempClothing = "Very cold, needs heavy winter coat, gloves, and a scarf.";
        }else if (temperature <= 15){
            tempClothing = "Chilly, light jacket needed.";
        }else if (temperature <= 25){
            tempClothing = "Pleasant, sweater or light jacket is enough.";
        }else {
            tempClothing = "Hot, comfortable and light clothes recommended.";
        }
        
        //determine special weather advice
        String weatherAdvice = "";
        if (specialWeather.equals("rain")){
            weatherAdvice = "Don't forget an umbrella!";
        }else if (specialWeather.equals("wind")){
            weatherAdvice = "Be cautious of the wind, wear a windbreaker!";
        }else if (specialWeather.equals("clear")){
            weatherAdvice = "";
        }
        
        //output results
        System.out.println();
        System.out.println("\nHello " + name +".");
        System.out.println("The Weather today is " + tempClothing);
        System.out.println(weatherAdvice);
        
        sc.close();
    }
}
