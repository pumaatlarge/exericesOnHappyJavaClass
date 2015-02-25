package org.waspec;

import java.io.*;

/**
 * Created by AlienLi on 2015-02-16.
 */
public class connectMySQL {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);

        while(true) {
            try {
                System.out.println("Please input 2 Integer: ");
                String content1 = bufferedReader.readLine();
                Integer integer1 = Integer.parseInt(content1);
                String content2 = bufferedReader.readLine();
                Integer integer2 = Integer.parseInt(content2);

                Calculator calculator = new Calculator();
                int result = calculator.add(integer1, integer2);
                System.out.println(String.format("%d + %d = %d", integer1, integer2, result));
                if (result == 99) {
                    System.out.println("Game over");
                    break;
                }

            } catch (IOException e) {
                System.out.println(" please input right number");
            }
            catch (NumberFormatException e) {
                System.out.println("numbers only");
            }

        }

    }


    static class Calculator {
        public int add(int x, int y)
        {
            return x + y;
        }

        }
    }