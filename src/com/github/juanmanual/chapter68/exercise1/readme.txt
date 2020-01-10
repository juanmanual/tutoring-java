 Write a program that creates a "personalized" letter, given a form letter and a person's name. The form letter is an input file of text (use file redirection). The person's name is a command line argument. The file is normal text, but with a * wherever a person's name should be substituted. For example:

Dear *,

I have exciting news for you, *!!! For just $49.99 plus postage
and handling you, *, can be the proud owner of a genuine leather
mouse pad!  No more finger strain for you, *, as you surf the web
with style.

Act Soon,

Venture Marketing Corp.

Assume the above is in a file junk.txt. A run of the program outputs:

C:\programs>java  JunkGenerator "Occupant" < junk.txt
Dear Occupant,

I have exciting news for you, Occupant!!! For just $49.99 plus postage
and handling you, Occupant, can be the proud owner of a genuine leather
mouse pad!  No more finger strain for you, Occupant, as you surf the web
with style.

Act Soon,

Venture Marketing Corp.

C:\programs>

Write the program so that it will substitute for any number of * on one line, and accepts any number of lines as input. The main program loop will be a while loop that continues until the input string (read with readLine()) is null.

If you wish to avoid the command line argument, ask the user for the occupant name and input it in the usual way.

Click here to go back to the main menu. 