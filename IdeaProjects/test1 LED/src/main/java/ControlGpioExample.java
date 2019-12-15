

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

    /* Put Desc and Credit Here

     */
    public class ControlGpioExample {
        private static int TIME_UNIT = 100;
        private static void dots(GpioPinDigitalOutput pin) throws InterruptedException {


            pin.high();
            System.out.print(" .");

            Thread.sleep(TIME_UNIT);

            pin.low();

            Thread.sleep(TIME_UNIT);

        }

        private static void dashes(GpioPinDigitalOutput pin) throws InterruptedException {

            pin.high();
            System.out.print(" -");

            Thread.sleep(TIME_UNIT*3);

            pin.low();


            Thread.sleep(TIME_UNIT);



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

            // Following was copied from https://stackoverflow.com/questions/29706653/morse-code-translatorsimple not sure if correct.
            for (String word: args) {


                String userInput = word.toLowerCase();

                char[] chars = userInput.toCharArray();

                String str = "";
                for (int i = 0; i < chars.length; i++) {

                    System.out.println("Displaying " + chars[i]);

                    switch (chars[i]) {

                        case 'a':
                            morseA(greenPin);
                            break;

                        case 'b':
                            morseB(greenPin);
                            break;

                        case 'c':
                            morseC(greenPin);
                            break;

                        case 'd':
                            morseD(greenPin);
                            break;
                        case 'e':
                            morseE(greenPin);
                            break;

                        case 'f':
                            morseF(greenPin);
                            break;

                        case 'g':
                            morseG(greenPin);
                            break;

                        case 'h':
                            morseH(greenPin);
                            break;

                        case 'i':
                            morseI(greenPin);
                            break;

                        case 'j':
                            morseJ(greenPin);
                            break;

                        case 'k':
                            morseK(greenPin);
                            break;

                        case 'l':
                            morseL(greenPin);
                            break;

                        case 'm':
                            morseM(greenPin);
                            break;

                        case 'n':
                            morseN(greenPin);
                            break;

                        case 'o':
                            morseO(greenPin);
                            break;

                        case 'p':
                            morseP(greenPin);
                            break;

                        case 'q':
                            morseQ(greenPin);
                            break;

                        case 'r':
                            morseR(greenPin);
                            break;

                        case 's':
                            morseS(greenPin);
                            break;

                        case 't':
                            morseT(greenPin);
                            break;

                        case 'u':
                            morseU(greenPin);
                            break;

                        case 'v':
                            morseV(greenPin);
                            break;

                        case 'w':
                            morseW(greenPin);
                            break;

                        case 'x':
                            morseX(greenPin);
                            break;

                        case 'y':
                            morseY(greenPin);
                            break;

                        case 'z':
                            morseZ(greenPin);
                            break;


                    }
                    Thread.sleep(TIME_UNIT * 3);
                    System.out.println();



              /*   if('a' == chars[i]) {

                    morseA(greenPin);

                } else if ('b'== chars[i]) {

                    morseB(greenPin);

                } else if ('c' ==chars[i]) {

                    morseC(greenPin);


                } else if ('d' ==chars[i]) {

                    morseD(greenPin);

                }
*/


              /*  for (int j = 0; j < english.length; j++) {

                    if (english[j] == chars[i]) {
                        str = str + Morse[j] + " ";
                    }
                } */
                }
                System.out.println(str);
            }

            Thread.sleep(TIME_UNIT*7);
        }
    }









