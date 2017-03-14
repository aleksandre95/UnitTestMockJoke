/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testex.jokefetching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class FetchFactory implements IFetchFactory {
    private final List<String> availableTypes
            = Arrays.asList("EduJoke", "ChuckNorris", "Moma", "Tambal");

    @Override
    public List<String> getAvailableTypes() {
        return availableTypes;
    }

    @Override
    public List<IJokeFetch> getJokeFetchers(String jokesToFetch) {
        List<IJokeFetch> jokes = new ArrayList<>();

        String[] tokens = jokesToFetch.split(",");

        for (String token : tokens) {
            switch (token) {
                case "eduprog":
                    jokes.add(new EduJoke());
                    break;
                case "chucknorris":
                    jokes.add(new Chuck());
                    break;
                case "moma":
                    jokes.add(new Moma());
                    break;
                case "tambal":
                    jokes.add(new Tambal());
                    break;
            }
        }

        return jokes;
    }
}
