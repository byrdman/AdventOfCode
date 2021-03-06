package net.thebyrdnest.aoc.aoc2015;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.ArrayList;

public class Day12 {


    public int sumNumbers(String[] input) {
        int sum = 0;
        for (String line : input) {
            sum += findNumber(line);
        }

        return sum;
    }

    public int findNumber(String line) {
        char[] cLine = line.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cLine) {
            if (c == '-')
                sb.append('-');

            if (c >= '0' && c <= '9')
                sb.append(c);
        }

        if (sb.length() != 0) {
            int number = Integer.parseInt(sb.toString());
            if (number != 0)
                System.out.println(number + " ] " + line);
            return number;
        } else {
            return 0;
        }
    }

    public String[] getAllEligible(String[] lines) {

        int iBracketCount = 0;
        for (String line : lines) {
            // check for red
            if (line.contains("{")) {
                iBracketCount++;
            }
        }
        return null;
    }

    public boolean checkForRed(JsonToken token) {
        if (token.equals(JsonToken.VALUE_STRING) && token.asString().equalsIgnoreCase("Red"))
            return true;
        else
            return false;
    }

    public int solve2(String json) {
        int sum = 0;

        JsonFactory factory = new JsonFactory();
        try {
            JsonParser parser = factory.createParser(json);

            while(!parser.isClosed()){
                JsonToken jsonToken = parser.nextToken();


                System.out.println("jsonToken = " + jsonToken);
            }

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return sum;
    }
}
