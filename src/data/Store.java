/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import phat.util.Inputer;

/**
 *
 * @author lionsibi
 */
public class Store {

    public static final int MAX_LIST = 100;
    Phone[] listPhone;
    private int counts = 0;
    private String name;
    private String userInfor;

    public Store(int numOfPhone, String name, String userInfor) {
        if (numOfPhone > 100 || numOfPhone < 0) {
            listPhone = new Phone[100];
        } else {
            listPhone = new Phone[numOfPhone];
        }
        this.name = name;
        this.userInfor = userInfor;
    }

    public void printMenu() {
        System.out.println("Welcome to " + name + "- @ 2017 by <" + userInfor + ">");
        System.out.println("Select the options below:");
        System.out.println("1. Add a Phone by Model");
        System.out.println("2. Search a Phone by Model");
        System.out.println("3. Remove the Phone information by Model");
        System.out.println("4. Print the Phone list in the descending order of Model");
        System.out.println("5. Quit");
    }

    public int getChoice() {
        printMenu();
        return Inputer.intputInteger();
    }

    public int find(String model) {
        if (counts > 0) {
            for (int i = 0; i < counts; i++) {
                if (model.equalsIgnoreCase(listPhone[i].getModel())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void addPhone() {
        String model;
        String CPU;
        int RAM;
        double camera;
        double screen;
        int check;
        do{
            System.out.print("Model: ");
            model = Inputer.inputString();
            check = find(model);
            if(check>=0)
                System.out.println("This model is existed");
        }while(check>=0);
        System.out.print("CPU: ");
        CPU = Inputer.inputString();
        System.out.print("RAM: ");
        RAM = Inputer.intputInteger();
        System.out.print("Primary camera: ");
        camera = Inputer.inputReal();
        System.out.print("Screen-size: ");
        screen = Inputer.inputReal();
        listPhone[counts] = new Phone(model, CPU, RAM, camera, screen);
        counts++;
    }
    
    public void search(){
        String model;
        System.out.print("Model: ");
        model = Inputer.inputString();
        int id = find(model);
        if(id >= 0 )
            System.out.println(listPhone[id]);
        else
            System.out.println("Not found!!!");
    }
    
    public void remove(){
        String model;
        System.out.print("Model: ");
        model = Inputer.inputString();
        int id = find(model);
        if(id >= 0){
            for (int i = id; i < counts; i++) {
                listPhone[i] = listPhone[i + 1];
            }
                counts--;
                System.out.println("Remove success!");
        }else
            System.out.println("Not found!!!");
    }
    
    public void descendingSort(){
        Phone swap;
        for (int i = 0; i < counts; i++) {
            for (int j = counts - 1; j > i; j--) {
                if (listPhone[j].getModel().compareTo(listPhone[j-1].getModel())<0) {
                    swap = listPhone[j];
                    listPhone[j] = listPhone[j-1];
                    listPhone[j-1] = swap;
                }
            }
        }
        for (int i = 0; i < counts; i++) {
            System.out.println(listPhone[i]);
        }
    }

}
