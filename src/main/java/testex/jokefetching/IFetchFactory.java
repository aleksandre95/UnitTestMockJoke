/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testex.jokefetching;

import java.util.List;

/**
 *
 * @author user
 */
public interface IFetchFactory {
     List<String> getAvailableTypes();

    List<IJokeFetch> getJokeFetchers(String jokesToFetch);
}
