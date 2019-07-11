# Quality Engineer Coding Problem

# Problem Statement:
Create a comparator library that can be used to compare 2 api responses (http/https) The input to your code should be two files with millions of request URLs.
Each file contains (http/https) api’s separated by new line.

# Approach:
  As I need to write a comparator utility which takes two arguments as file1 and file2 and this comparator will take care of below  technical challenge.
      1.Comparator utility is able to compare both XML and JSON response.
      2.Millions of http/https requests will get compare without any memory issues in system.
      3.Test coverage with sonar cube.
      4.User friendly statment when api responses are compared such as Not equals, Equals, Not match, Url malformed etc..
      5.End-to-End Testing with all test cases.
      6.Devops adoption for continues running test cases


# Design:
Have used abstract factory pattern for response type when request is hit.