package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexTest {

    @Test
    public void regexTest() {
        System.out.println("Enter your text: ");
        Scanner scannerText = new Scanner(/*System.in*/ " У лукоморья дуб зеленый златая цепь на дубе том");
        String text = scannerText.nextLine();

        System.out.println("Enter your fragments: ");
        Scanner scannerFragment = new Scanner("дуб");
        String fragment = scannerFragment.nextLine();

        Regex regular = new Regex();
        assertEquals(" У лукоморья  зеленый златая цепь на  том", regular.replaceRegular(text, fragment));
    }
}
