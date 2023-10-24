
//opens numbers html as a writing file
with open("numbers.html", "w") as f:
    //creates title "List of Numbers"
    //Creates a table with axis of odd and even numbers
    f.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n")
    f.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n")

    //for numbers 1-50 adds them to the table based on odd or even
    for i in range(1, 50):
        if i / 2 == 0:
            f.write("<tr><td>{}</td><td></td></tr>\n".format(i))
        else:
            f.write("<tr><td></td><td>{}</td></tr>\n".format(i))
    f.write("</table>\n</body>\n</html>")

//change file to read
with open("numbers.html", "r") as f:
    print(f.read())
    
