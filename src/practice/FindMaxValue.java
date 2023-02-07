package practice;

import file.txt.ReadAndFileWrite;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static  void main(String[] args) {

        ReadAndFileWrite readAndWriteFile = new ReadAndFileWrite();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
