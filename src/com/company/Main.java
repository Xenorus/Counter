package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

	    //читаем текст программы

        StringBuilder text_for_analysis = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("text.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text_for_analysis.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //в text_for_analysis хранится текст, просто в более удобном формате
        //


        //сбор критериев (ключевых слов)
        StringBuilder keywords = new StringBuilder();
        int row_count = 0;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/criteria"))) {
            String line2;
            while ((line2 = reader.readLine()) != null) {
                keywords.append(line2).append(System.lineSeparator());
                row_count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(keywords);

        //вычленение ключевых слов из текста
        //оценка и подсчет ключевых слов

        //вывод ответа в текстовый файл
    }

    public static void found(StringBuilder line, int row_count) {
        String[][] array = new String[2][row_count]; //для записи ключевых слов
        // и их ценности

        int width = 0; //ширина
        int height = 0; //высота
        while (array[1][row_count-1] == null) {
          //  array[width][height] = line.cha

                  //  line.charAt('|');
        }
    }
}
