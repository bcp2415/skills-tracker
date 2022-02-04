package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    private String languageListHTML = "<html>" +
            "<body>" +
            "<h1>Skills Tracker</h1>" +
            "<h2>Languages:" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>TypeScript</li>" +
            "</ol>" +
            "</h2>" +
            "</body>" +
            "</html>";

    private String formHTML = "<html>" +
            "<body>" +
            "<h2>Enter your name, and choose your three favorite programming languages: </h2>" +
            "<form action='/result' method='POST'>" +  // submit request to /hello
            "<label for='name'>Enter your name: </label>" +
            "<br>" +
            "<input type='text' name='name'>" +
            "<br>" +
            "<label for='lang1'>Choose your favorite language: </label>" +
            "<select name='lang1' id='lang1-select'>" +
            "<option value='java'>Java</option>" +
            "<option value='javascript'>JavaScript</option>" +
            "<option value='typescript'>TypeScript</option>" +
            "</select>" +
            "<br>" +
            "<label for='lang2'>Choose your 2nd favorite language: </label>" +
            "<select name='lang2' id='lang2-select'>" +
            "<option value='java'>Java</option>" +
            "<option value='javascript'>JavaScript</option>" +
            "<option value='typescript'>TypeScript</option>" +
            "</select>" +
            "<br>" +
            "<label for='lang3'>Choose your 3rd favorite language: </label>" +
            "<select name='lang3' id='lang3-select'>" +
            "<option value='java'>Java</option>" +
            "<option value='javascript'>JavaScript</option>" +
            "<option value='typescript'>TypeScript</option>" +
            "</select>" +
            "<br>" +
            "<input type='submit' value='Submit Answers'>" +
            "</form>" +
            "</body>" +
            "</html>";


    @GetMapping
    public String listLanguages() {
        return languageListHTML;
    }

    @GetMapping("form")
    public String displayForm() {
        return formHTML;
    }

    @PostMapping("result")
    public String displaySubmission(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        return "<html>" +
                "<body>" +
                "<h1>Your name: " + name + "</h1>" +
                "<table>" +
                "<th>" +
                "<h3>Your favorite languages: </h3>" +
                "</th>" +
                "<tr>" +
                "<td>" + lang1 + "</td>" +
                        "</tr>" +
                "<tr>" +
                "<td>" + lang2 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" + lang3 + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
