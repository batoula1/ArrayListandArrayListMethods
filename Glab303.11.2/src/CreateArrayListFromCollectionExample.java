import java.util.ArrayList;

public class CreateArrayListFromCollectionExample{

    public static void main(String[] args) {
        List<Integer> fistFivePrimeNumbers = new ArrayList<>();
        fistFivePrimeNumbers.add(2);
        fistFivePrimeNumbers.add(3);
        fistFivePrimeNumbers.add(5);
        fistFivePrimeNumbers.add(7);
        fistFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimerNumbers = new ArrayList<>(fistFivePrimeNumbers);

        List<Integer> nextFiveNumbers = new ArrayList<>();
        nextFiveNumbers.add(13);
        nextFiveNumbers.add(17);
        nextFiveNumbers.add(19);
        nextFiveNumbers.add(23);
        nextFiveNumbers.add(29);

        firstTenPrimerNumbers.addAll(nextFiveNumbers);

        System.out.println(firstTenPrimerNumbers);
    }
}
