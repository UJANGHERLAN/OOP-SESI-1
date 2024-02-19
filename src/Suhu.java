public class Suhu{
    public static void main(String[] args)throws Exception {
        //Input Suhu Rearmur menggunkan System.console
        System.console();
        System.out.println("Maukan Suhu Rearmur:");
        String input = System.console().readLine();
        double reamur = Double.parseDouble(input);

        //Proseses penghitungan dengan rumus yang sudah di tentukan 
        double celcius = 5.00/4 *reamur; //Berikut rumus yang sudah di kasih sebelumnya
        double fahrenheit = 9.00/5 + celcius + 32; //Berikut rumus yang sudah di kasih sebelumnya
        double kelvin = celcius + 273; //Berikut rumus yang sudah di kasih sebelumnya

        //Output
        System.out.println("Temperature in Celsius: " + celcius + " °C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperature in Kelvin: " + kelvin + " K");
    }
}