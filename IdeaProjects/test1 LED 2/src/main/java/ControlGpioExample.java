

    /*
     * #%L
     * **********************************************************************
     * ORGANIZATION  :  Pi4J
     * PROJECT       :  Pi4J :: Java Examples
     * FILENAME      :  ControlGpioExample.java
     *
     * This file is part of the Pi4J project. More information about
     * this project can be found here:  https://www.pi4j.com/
     * **********************************************************************
     * %%
     * Copyright (C) 2012 - 2019 Pi4J
     * %%
     * This program is free software: you can redistribute it and/or modify
     * it under the terms of the GNU Lesser General Public License as
     * published by the Free Software Foundation, either version 3 of the
     * License, or (at your option) any later version.
     *
     * This program is distributed in the hope that it will be useful,
     * but WITHOUT ANY WARRANTY; without even the implied warranty of
     * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     * GNU General Lesser Public License for more details.
     *
     * You should have received a copy of the GNU General Lesser Public
     * License along with this program.  If not, see
     * <http://www.gnu.org/licenses/lgpl-3.0.html>.
     * #L%
     */

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

    /**
     * This example code demonstrates how to perform simple state
     * control of a GPIO pin on the Raspberry Pi.
     *
     * @author Robert Savage
     */
    public class ControlGpioExample {
        private static void dots(GpioPinDigitalOutput pin) throws InterruptedException {

            pin.high();
            System.out.println("--> Pin = ON");

            Thread.sleep(500);

            pin.low();
            System.out.println("--> Pin = OFF");

            Thread.sleep(400);

        }

        private static void dashes(GpioPinDigitalOutput pin) throws InterruptedException {

            pin.high();
            System.out.println("--> Pin = ON");

            Thread.sleep(1000);

            pin.low();
            System.out.println("--> Pin = OFF");

            Thread.sleep(400);


        }

        private static void morseA(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dashes(pin);


        }

        private static void morseB(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);

            dots(pin);

            dots(pin);
        }

        private static void morseC(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);

            dashes(pin);

            dots(pin);
        }

        private static void morseD(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);

            dots(pin);
        }

        private static void morseE(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);
        }

        private static void morseF(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dots(pin);

            dashes(pin);

            dots(pin);
        }

        private static void morseG(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dashes(pin);

            dots(pin);
        }

        private static void morseH(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dots(pin);

            dots(pin);

            dots(pin);
        }

        private static void morseI(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dots(pin);
        }

        private static void morseJ(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dashes(pin);

            dashes(pin);

        }

        private static void morseK(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);

            dashes(pin);
        }

        private static void morseL(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dashes(pin);

            dots(pin);

            dots(pin);
        }

        private static void morseM(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dashes(pin);
        }

        private static void morseN(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);


        }

        private static void morseO(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dashes(pin);

            dashes(pin);
        }

        private static void morseP(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dashes(pin);

            dashes(pin);

            dots(pin);

        }

        private static void morseQ(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dashes(pin);

            dots(pin);

            dashes(pin);
        }

        private static void morseR(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dashes(pin);

            dots(pin);
        }

        private static void morseS(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dots(pin);

            dots(pin);
        }

        private static void morseT(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

        }

        private static void morseU(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dots(pin);

            dashes(pin);
        }

        private static void morseV(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dots(pin);

            dots(pin);

            dashes(pin);
        }

        private static void morseW(GpioPinDigitalOutput pin) throws InterruptedException {

            dots(pin);

            dashes(pin);

            dashes(pin);
        }

        private static void morseX(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);

            dots(pin);

            dashes(pin);
        }

        private static void morseY(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dots(pin);

            dashes(pin);

            dashes(pin);

        }

        private static void morseZ(GpioPinDigitalOutput pin) throws InterruptedException {

            dashes(pin);

            dashes(pin);

            dots(pin);

            dots(pin);
        }


        public static void main(String[] args) throws InterruptedException {

            char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String[] Morse = {"MorseA", "morseB", "morseC", "morseD", "morseE", "morseF", "morseG", "morseH", "morseI", "morseJ", "morseK", "morseL", "morseM", "morseN", "morseO", "morseP", "morseQ", "morseR", "morseS", "morseT", "morseU", "morseV", "morseW", "morseX", "morseY", "morseZ"};

            System.out.println("<--Pi4J--> GPIO Control Example ... started.");

            // create gpio controller
            final GpioController gpio = GpioFactory.getInstance();

            // provision gpio pin #01 as an output pin and turn on
            final GpioPinDigitalOutput redPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25, "MyLED", PinState.LOW);

            final GpioPinDigitalOutput greenPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29, "MyLED", PinState.LOW);
            // set shutdown state for this pin
            greenPin.setShutdownOptions(true, PinState.LOW);
            redPin.setShutdownOptions(true, PinState.LOW);
            System.out.println("--> No activity");

            Thread.sleep(5000);

            // Following was copied from https://stackoverflow.com/questions/29706653/morse-code-translatorsimple not sure if correct.
            String userInput = "TEST".toLowerCase();

            char[] chars = userInput.toCharArray();

            String str = "";
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < english.length; j++) {

                    if (english[j] == chars[i]) {
                        str = str + Morse[j] + " ";
                    }
                }
            }
            System.out.println(str);
        }
    }









