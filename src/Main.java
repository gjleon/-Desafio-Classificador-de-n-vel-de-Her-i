import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String nivel;
        int xp;

        System.out.println("Digite seu o nome do heroi: ");
        nome = scanner.nextLine();
        System.out.println("Digite a xp do heroi: ");
        xp = scanner.nextInt();

        if (xp <= 1000) {
            nivel = "Ferro";
        } else if (xp <= 2000) {
            nivel = "Bronze";
        } else if (xp <= 5000) {
            nivel = "Prata";
        } else if (xp <= 7000) {
            nivel = "Ouro";
        } else if (xp <= 8000) {
            nivel = "Platina";
        } else if (xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp <= 10000) {
            nivel = "Imortal";
        }else {
            nivel = "Radiante";
        }

        System.out.println("O Herói de nome "+ nome +" está no nível de "+ nivel);
    }
}

