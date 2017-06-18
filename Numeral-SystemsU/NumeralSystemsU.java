
/**
 * This program convert the same integer that user enter it from any one of the 4 main systems
 * ( Binary,Octal,Decimal and Hexadecimal) to any one of these systems .
 ***********************************
 * @author: EYAD AL AMAWI          *      
 * @author: MAHMOUD A-SHEKH KHALIL *        
 ***********************************
 */

// Code Start 

import java.util.Scanner;

public class NumeralSystemsU {

    Scanner input = new Scanner(System.in);

    /**
     * This method convert the number from the Binary to the Decimal.
     */
    public void BinToDec() //B2D
    {
        System.out.println("Enter Number in Binary System: ");
        String bin = input.next();
        int length = bin.length();
        int total = 0;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;
            if (!(bin.charAt(i) == '0' || bin.charAt(i) == '1')) {
                System.out.println("Invalid value! ");
                break;
            } else {
                switch (bin.charAt(i)) {
                    case '1':
                        dec = (int) Math.pow(2, j);
                        break;
                    case '0':
                        dec = 0;
                        break;

                }
                total += dec;
                if (i == 0) {
                    System.out.println("Decimal System: " + total);
                }
            }
        }

    }

    /**
     * This method convert the number from the Octal to the Decimal.
     */
    public void OctToDec() //O2D
    {
        System.out.println("Enter Number in Octal System:");
        String OctNumber = input.next();

        int total = 0;

        String oct = OctNumber;
        int length = oct.length();
        boolean value = true;

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;

            switch (oct.charAt(i)) {
                case '0':
                    dec = 0;
                    break;
                case '1':
                    dec = (int) Math.pow(8, j);
                    break;
                case '2':
                    dec = (int) Math.pow(8, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(8, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(8, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(8, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(8, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(8, j) * 7;
                    break;
                default:
                    value = false;

            }

            total += dec;

        }
        if (value) {
            System.out.println("Decimal System: " + total);
        } else {
            System.out.println("Invalid value!");
        }

    }

    /**
     * This method convert the number from the Hexadecimal to the Decimal.
     */
    public void HexToDec() //H2D
    {
        System.out.println("Enter Number in Hexdecimal System: ");
        String hex = input.next();
        int length = hex.length();
        hex = hex.toLowerCase();
        long total = 0;
        boolean test = true;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;

            switch (hex.charAt(i)) {
                case '1':
                    dec = (int) Math.pow(16, j);
                    break;
                case '2':
                    dec = (int) Math.pow(16, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(16, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(16, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(16, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(16, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(16, j) * 7;
                    break;
                case '8':
                    dec = (int) Math.pow(16, j) * 8;
                    break;
                case '9':
                    dec = (int) Math.pow(16, j) * 9;
                    break;
                case 'a':
                    dec = (int) Math.pow(16, j) * 10;
                    break;
                case 'b':
                    dec = (int) Math.pow(16, j) * 11;
                    break;
                case 'c':
                    dec = (int) Math.pow(16, j) * 12;
                    break;
                case 'd':
                    dec = (int) Math.pow(16, j) * 13;
                    break;
                case 'e':
                    dec = (int) Math.pow(16, j) * 14;
                    break;
                case 'f':
                    dec = (int) Math.pow(16, j) * 15;
                    break;
                case '0':
                    dec = 0;
                    break;
                default:
                    test = false;
                    break;
            }

            total += dec;

        }
        if (test) {
            System.out.println(total);
        } else {
            System.out.println("Invalid value!");
        }

    }

    /**
     * This method convert the number from the Decimal to the Binary.
     */
    public void DecToBin() //D2B
    {
        System.out.println("Enter Number in Decimal System: ");
        if (input.hasNextLong()) {
            long dec = input.nextLong();
            String binary = "";
            if (dec > 0) {
                while (dec > 0) {
                    String bin = dec % 2 + "";
                    dec = dec / 2;
                    binary = bin + binary;
                }
            } else if (dec == 0) {
                binary = "0";
            } else {
                System.out.print("Invalid value! ");
            }
            System.out.println(binary);
        } else {
            System.out.println("Invalid value! ");
        }
    }

    /**
     * This method convert the number from the Octal to the Binary.
     */
    public void OctToBin() //O2B
    {
        System.out.println("Enter Number in Octal System:");
        String OctNumber = input.next();

        long total = 0;

        String oct = OctNumber;
        int length = oct.length();
        boolean value = true;

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;

            switch (oct.charAt(i)) {
                case '0':
                    dec = 0;
                    break;
                case '1':
                    dec = (int) Math.pow(8, j);
                    break;
                case '2':
                    dec = (int) Math.pow(8, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(8, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(8, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(8, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(8, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(8, j) * 7;
                    break;
                default:
                    value = false;

            }

            total += dec;

        }
        if (value) {
            String binary = "";
            if (total > 0) {
                while (total > 0) {
                    String bin = total % 2 + "";
                    total = total / 2;
                    binary = bin + binary;
                }
            } else if (total == 0) {
                binary = "0";
            } else {
                System.out.print("Invalid value! ");
            }
            System.out.println(binary);
        } else {
            System.out.println("Invalid value! ");
        }

    }

    /**
     * This method convert the number from the Hexadecimal to the Binary.
     */
    public void HexToBin() //H2B
    {

        System.out.println("Enter Number in Hexdecimal System: ");
        String hex = input.next();
        int length = hex.length();
        hex = hex.toLowerCase();
        long total = 0;
        boolean test = true;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;

            switch (hex.charAt(i)) {
                case '1':
                    dec = (int) Math.pow(16, j);
                    break;
                case '2':
                    dec = (int) Math.pow(16, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(16, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(16, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(16, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(16, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(16, j) * 7;
                    break;
                case '8':
                    dec = (int) Math.pow(16, j) * 8;
                    break;
                case '9':
                    dec = (int) Math.pow(16, j) * 9;
                    break;
                case 'a':
                    dec = (int) Math.pow(16, j) * 10;
                    break;
                case 'b':
                    dec = (int) Math.pow(16, j) * 11;
                    break;
                case 'c':
                    dec = (int) Math.pow(16, j) * 12;
                    break;
                case 'd':
                    dec = (int) Math.pow(16, j) * 13;
                    break;
                case 'e':
                    dec = (int) Math.pow(16, j) * 14;
                    break;
                case 'f':
                    dec = (int) Math.pow(16, j) * 15;
                    break;
                case '0':
                    dec = 0;
                    break;
                default:
                    test = false;
                    break;
            }

            total += dec;

        }
        if (test) {
            String binary = "";
            if (total > 0) {
                while (total > 0) {
                    String bin = total % 2 + "";
                    total = total / 2;
                    binary = bin + binary;
                }
            } else if (total == 0) {
                binary = "0";
            } else {
                System.out.print("Invalid value! ");
            }
            System.out.println(binary);
        } else {
            System.out.println("Invalid value! ");
        }

    }

    /**
     * This method convert the number from the Decimal to the Octal.
     */
    public void DecToOct() //D2O
    {
        System.out.println("Enter Number in Decimal System: ");
        if (input.hasNextLong()) {
            long dec = input.nextLong();
            String octal = "";
            if (dec > 0) {
                while (dec > 0) {
                    String oct = dec % 8 + "";
                    dec = dec / 8;
                    octal = oct + octal;
                }

            } else if (dec == 0) {
                octal = "0";
            } else {
                System.out.print("Invalid value! ");
            }
            System.out.println(octal);
        } else {
            System.out.println("Invalid value! ");
        }
    }

    /**
     * This method convert the number from the Binary to the Octal.
     */
    public void BinToOct() //B2O
    {
        System.out.println("Enter Number in Binary System: ");
        String bin = input.next();
        int length = bin.length();
        int total = 0;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;
            if (!(bin.charAt(i) == '0' || bin.charAt(i) == '1')) {
                System.out.println("Invalid value! ");
                break;
            } else {
                switch (bin.charAt(i)) {
                    case '1':
                        dec = (int) Math.pow(2, j);
                        break;
                    case '0':
                        dec = 0;
                        break;

                }
                total += dec;
                if (i == 0) {
                    String octal = "";
                    if (total > 0) {
                        while (total > 0) {
                            String oct = total % 8 + "";
                            total = total / 8;
                            octal = oct + octal;
                        }

                    } else if (total == 0) {
                        octal = "0";
                    } else {
                        System.out.print("Invalid value! ");
                    }
                    System.out.println(octal);
                }
            }
        }

    }

    /**
     * This method convert the number from the Hexadecimal to the Octal.
     */
    public void HexToOct() //H2O
    {
        System.out.println("Enter Number in Hexdecimal System: ");
        String hex = input.next();
        int length = hex.length();
        hex = hex.toLowerCase();
        long total = 0;
        boolean test = true;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;

            switch (hex.charAt(i)) {
                case '1':
                    dec = (int) Math.pow(16, j);
                    break;
                case '2':
                    dec = (int) Math.pow(16, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(16, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(16, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(16, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(16, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(16, j) * 7;
                    break;
                case '8':
                    dec = (int) Math.pow(16, j) * 8;
                    break;
                case '9':
                    dec = (int) Math.pow(16, j) * 9;
                    break;
                case 'a':
                    dec = (int) Math.pow(16, j) * 10;
                    break;
                case 'b':
                    dec = (int) Math.pow(16, j) * 11;
                    break;
                case 'c':
                    dec = (int) Math.pow(16, j) * 12;
                    break;
                case 'd':
                    dec = (int) Math.pow(16, j) * 13;
                    break;
                case 'e':
                    dec = (int) Math.pow(16, j) * 14;
                    break;
                case 'f':
                    dec = (int) Math.pow(16, j) * 15;
                    break;
                case '0':
                    dec = 0;
                    break;
                default:
                    test = false;
                    break;
            }

            total += dec;

        }
        if (test) {
            //////
            String octal = "";
            if (total > 0) {
                while (total > 0) {
                    String oct = total % 8 + "";
                    total = total / 8;
                    octal = oct + octal;
                }

            } else if (total == 0) {
                octal = "0";
            } else {
                System.out.print("Invalid value! ");
            }
            System.out.println(octal);
            //////
        } else {
            System.out.println("Invalid value!");
        }

    }

    /**
     * This method convert the number from the Decimal to the Hexadecimal.
     */
    public void DecToHex() //D2H
    {
        System.out.println("Enter Number in Decimal System: ");
        if (input.hasNextLong()) {
            long dec = input.nextLong();
            String hex = "";
            if (dec > 0) {
                while (dec > 0) {
                    int mod = (int) dec % 16;
                    dec = dec / 16;
                    switch (mod) {
                        case 0:
                            hex = "0" + hex;
                            break;
                        case 1:
                            hex = "1" + hex;
                            break;
                        case 2:
                            hex = "2" + hex;
                            break;
                        case 3:
                            hex = "3" + hex;
                            break;
                        case 4:
                            hex = "4" + hex;
                            break;
                        case 5:
                            hex = "5" + hex;
                            break;
                        case 6:
                            hex = "6" + hex;
                            break;
                        case 7:
                            hex = "7" + hex;
                            break;
                        case 8:
                            hex = "8" + hex;
                            break;
                        case 9:
                            hex = "9" + hex;
                            break;
                        case 10:
                            hex = "A" + hex;
                            break;
                        case 11:
                            hex = "B" + hex;
                            break;
                        case 12:
                            hex = "C" + hex;
                            break;
                        case 13:
                            hex = "D" + hex;
                            break;
                        case 14:
                            hex = "E" + hex;
                            break;
                        case 15:
                            hex = "F" + hex;
                            break;
                    }
                }
                System.out.println(hex);

            } else if (dec == 0) {
                System.out.println("0");
            } else {
                System.out.println("Invalid value! ");
            }
        } else {
            System.out.println("Invalid value! ");
        }
    }

    /**
     * This method convert the number from the Binary to the Hexadecimal.
     */
    public void BinToHex() //B2H
    {
        System.out.println("Enter Number in Binary System: ");
        String bin = input.next();
        int length = bin.length();
        int total = 0;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;
            if (!(bin.charAt(i) == '0' || bin.charAt(i) == '1')) {
                System.out.println("Invalid value! ");
                break;
            } else {
                switch (bin.charAt(i)) {
                    case '1':
                        dec = (int) Math.pow(2, j);
                        break;
                    case '0':
                        dec = 0;
                        break;

                }
                total += dec;
                if (i == 0) {
                    String hex = "";

                    if (total > 0) {
                        while (total > 0) {
                            int mod = (int) total % 16;
                            total = total / 16;
                            switch (mod) {
                                case 0:
                                    hex = "0" + hex;
                                    break;
                                case 1:
                                    hex = "1" + hex;
                                    break;
                                case 2:
                                    hex = "2" + hex;
                                    break;
                                case 3:
                                    hex = "3" + hex;
                                    break;
                                case 4:
                                    hex = "4" + hex;
                                    break;
                                case 5:
                                    hex = "5" + hex;
                                    break;
                                case 6:
                                    hex = "6" + hex;
                                    break;
                                case 7:
                                    hex = "7" + hex;
                                    break;
                                case 8:
                                    hex = "8" + hex;
                                    break;
                                case 9:
                                    hex = "9" + hex;
                                    break;
                                case 10:
                                    hex = "A" + hex;
                                    break;
                                case 11:
                                    hex = "B" + hex;
                                    break;
                                case 12:
                                    hex = "C" + hex;
                                    break;
                                case 13:
                                    hex = "D" + hex;
                                    break;
                                case 14:
                                    hex = "E" + hex;
                                    break;
                                case 15:
                                    hex = "F" + hex;
                                    break;
                            }
                        }
                        System.out.println(hex);

                    } else if (total == 0) {
                        System.out.println("0");
                    } else {
                        System.out.println("Invalid value! ");
                    }
                }
            }
        }

    }

    /**
     * This method convert the number from the Octal to the Hexadecimal.
     */
    public void OctToHex() //O2H 
    {
        System.out.println("Enter Number in Octal System:");
        String OctNumber = input.next();

        int total = 0;

        String oct = OctNumber;
        int length = oct.length();
        boolean value = true;

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;

            switch (oct.charAt(i)) {
                case '0':
                    dec = 0;
                    break;
                case '1':
                    dec = (int) Math.pow(8, j);
                    break;
                case '2':
                    dec = (int) Math.pow(8, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(8, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(8, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(8, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(8, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(8, j) * 7;
                    break;
                default:
                    value = false;

            }

            total += dec;

        }
        if (value) {
            String hex = "";
            if (total > 0) {
                while (total > 0) {
                    int mod = (int) total % 16;
                    total = total / 16;
                    switch (mod) {
                        case 0:
                            hex = "0" + hex;
                            break;
                        case 1:
                            hex = "1" + hex;
                            break;
                        case 2:
                            hex = "2" + hex;
                            break;
                        case 3:
                            hex = "3" + hex;
                            break;
                        case 4:
                            hex = "4" + hex;
                            break;
                        case 5:
                            hex = "5" + hex;
                            break;
                        case 6:
                            hex = "6" + hex;
                            break;
                        case 7:
                            hex = "7" + hex;
                            break;
                        case 8:
                            hex = "8" + hex;
                            break;
                        case 9:
                            hex = "9" + hex;
                            break;
                        case 10:
                            hex = "A" + hex;
                            break;
                        case 11:
                            hex = "B" + hex;
                            break;
                        case 12:
                            hex = "C" + hex;
                            break;
                        case 13:
                            hex = "D" + hex;
                            break;
                        case 14:
                            hex = "E" + hex;
                            break;
                        case 15:
                            hex = "F" + hex;
                            break;
                    }
                }
                System.out.println(hex);

            } else if (total == 0) {
                System.out.println("0");
            } else {
                System.out.println("Invalid value! ");
            }
        } else {
            System.out.println("Invalid value!");
        }

    }

}
// Code End 

/*
 *****************************************
 * @author: EYAD AL AMAWI                *      
 * @author: MAHMOUD A-SHEKH KHALIL       *
 * Copyright 2017 © All Rights Reserved  *                                *
 *****************************************
*/
