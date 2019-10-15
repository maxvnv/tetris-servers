# Welcome to the Krakow  Ocado Hackathon!
## Make testris grerat again!

### Setting up:

For NonJava languages:
- please go to .\src\main\<language>
- chose your language
- and follow README.md instructions

For Java:
- setup Java (JDK 8)
    + setup JAVA_HOME variable
- setup Maven3
    + setup M2_HOME variable
    + setup Path variable
    + open cmd and run command 'mvn -version' it should print valid java and maven location
- import this project as Maven project into Intellij Idea (Eclipse/ is not recommended)


### The Game
- register your hero on [server](http://server/codenjoy-contest/register)
- [here](http://codenjoy.com/codenjoy-contest/resources/help/tetris-en.html) are the game rules and its description
- in class ```.\src\main\java\com\codenjoy\dojo\bomberman\client\YourSolver.java```
    + copy the board page browser url from address bar and paste into the main method
    + implement logic inside method
        * ``` public String get(Board board)```
    + run main method of YourSolver class
    + [here](http://server/codenjoy-contest/board/game/bomberman) you can check the leaderboard - your bot should move
    + if something changed - restart the process
        * warning! only one instance of YourSolver class you can run per player - please check this
        
### Tips

- Check out ```.\src\main\java\com\codenjoy\dojo\bomberman\client\Board.java```
    + this is the starting point. It's what you get from the server
    + you can retrieve the current / future figures and their properties
    + you can also add you own methods to work with a board
    + For a readable view of the glass board, try to invoke AbstractBoard#boardAsString
- Check out GlassBoard and AbstractBoard API, there are quite a few useful methods for reading the glass board's state  
- There are some tests prepared for you in ```.\src\test\java\com\codenjoy\dojo\bomberman\client```     
    + check them out and write your own
- Codenjoy!