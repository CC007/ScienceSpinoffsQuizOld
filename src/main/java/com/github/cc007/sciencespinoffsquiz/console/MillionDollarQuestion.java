/* 
 * The MIT License
 *
 * Copyright 2015 Rik Schaaf aka CC007 <http://coolcat007.nl/>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.cc007.sciencespinoffsquiz.console;

import com.github.cc007.sciencespinoffsquiz.quiz.controller.GameMaster;
import com.github.cc007.sciencespinoffsquiz.quiz.storage.NoGameStatisticsStorage;
import com.github.cc007.sciencespinoffsquiz.console.ConsoleAdapter;

/**
 *
 * @author Rik Schaaf aka CC007 <http://coolcat007.nl/>
 */
public class MillionDollarQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsoleAdapter ca = new ConsoleAdapter();
        String xmlFileName = null;
        switch (ca.getLanguage()) {
            case "Nederlands":
                xmlFileName = "questions_nl.xml";
                break;
            case "English":
                xmlFileName = "questions_en.xml";
                break;
        }
        GameMaster gm = new GameMaster(ca, xmlFileName, new NoGameStatisticsStorage());
        gm.startGame();

    }

}
