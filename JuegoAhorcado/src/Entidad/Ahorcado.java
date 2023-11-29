    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Entidad;

    import java.util.Arrays;

    /**
     *
     * @author franc
     */
    public class Ahorcado {

         private String [] palabraB;
        private int intMax;
        private int letEnc;
        private int longVect;

        public Ahorcado(String[] palabraB, int intMax, int letEnc, int longVect) {
            this.palabraB = palabraB;
            this.intMax = intMax;
            this.letEnc = letEnc;
            this.longVect = palabraB.length; 
         
        }

        @Override
        public String toString() {
            return "Ahorcado{" + "La palabra ingresada fue=" + Arrays.toString(palabraB) + ", Las cantidades de intentos fueron=" + intMax + ", Las letras encontradas fueron=" + letEnc +  '}';
        }


        public Ahorcado() {
        }

        //metodo para darle el indice al vector
        public Ahorcado(int longit)
        {
            palabraB = new String[longit];
        }

        public String[] getPalabraB() {
            return palabraB;
        }

        public void setPalabraB(String[] palabraB) {
            this.palabraB = palabraB;
        }

        public int getIntMax() {
            return intMax;
        }

        public void setIntMax(int intMax) {
            this.intMax = intMax;
        }

        public int getLetEnc() {
            return letEnc;
        }

        public void setLetEnc(int letEnc) {
            this.letEnc = letEnc;
        }

        public int getLongVect() {
            return longVect;
        }

        public void setLongVect(int longVect) {
            this.longVect = longVect;
        }


    }
