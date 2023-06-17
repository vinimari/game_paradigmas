package classes;

public class Player {
  int id;
  String player_name;
  int[] current_position;
  boolean stored_item;
  int initial_name_position = 5;

  public Player(int id, String player_name, int[] current_position) {
    this.id = id;
    this.player_name = player_name;
    this.current_position = current_position;
  }

  public int getId() {
    return this.id;
  }

  public String getPlayerName() {
    return this.player_name;
  }

  public int[] getCurrentPosition() {
    return this.current_position;
  }

  public boolean getStoredItem() {
    return this.stored_item;
  }

  public void useItem() {
    this.stored_item = false; 
  }

  public void setStoredItem() {
    this.stored_item = true;
  }

  static boolean checkInsideBoard(int new_row, int new_col) {
    boolean is_inside = false;
    if (new_row >= 0 && new_row < 9 && new_col >= 0 && new_col < 9) {
      is_inside = true;
    }
    return is_inside;
  }

  public void movePlayer(String new_direction, String[][] board) {

    int[] currentPosition = getCurrentPosition();
    int row = currentPosition[0];
    int col = currentPosition[1];

    switch (new_direction) {
      // Move North (decrease row one unity)
      case "W": {
        int new_row = row - 1;

        if (checkInsideBoard(new_row, col)) {
          String piece_name = board[new_row][col];

          if (piece_name == " ") {
            board[row][col] = " ";
            board[new_row][col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[0] = new_row;
          } else if (piece_name.charAt(initial_name_position) == 'J') {
            System.out.println("Ops, existe outro jogador nessa posição");
          } else if (piece_name.charAt(initial_name_position) == 'F') {
            System.out.println(player_name + " colidiu com uma fake news");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == 'X') {
            System.out.println(player_name + " colidiu com uma zona de restrição");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == '?') {
            System.out.println(player_name + " armazenou um item");
            board[row][col] = " ";
            board[new_row][col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[0] = new_row;
            setStoredItem();
          }
        } else {
          System.out.println(player_name + " saiu do tabuleiro!");
          board[row][col] = " ";
        }
        break;
      }
      // Move South (increase row one unity)
      case "S": {
        int new_row = row + 1;
        if (checkInsideBoard(new_row, col)) {
          String piece_name = board[new_row][col];
          if (piece_name == " ") {
            board[row][col] = " ";
            board[new_row][col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[0] = new_row;
          } else if (piece_name.charAt(initial_name_position) == 'J') {
            System.out.println("Ops, existe outro jogador nessa posição");
          } else if (piece_name.charAt(initial_name_position) == 'F') {
            System.out.println(player_name + " colidiu com uma fake news");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == 'X') {
            System.out.println(player_name + " colidiu com uma zona de restrição");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == '?') {
            System.out.println(player_name + " armazenou um item");
            board[row][col] = " ";
            board[new_row][col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[0] = new_row;
            setStoredItem();
          }
        } else {
          System.out.println(player_name + " saiu do tabuleiro!");
          board[row][col] = " ";
        }
        break;
      }
      // Move East / Right (increase col one unity)
      case "D": {
        int new_col = col + 1;

        if (checkInsideBoard(row, new_col)) {
          String piece_name = board[row][new_col];
          if (piece_name == " ") {
            board[row][col] = " ";
            board[row][new_col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[1] = new_col;

          } else if (piece_name.charAt(initial_name_position) == 'J') {
            System.out.println("Ops, existe outro jogador nessa posição");
          } else if (piece_name.charAt(initial_name_position) == 'F') {
            System.out.println(player_name + " colidiu com uma fake news");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == 'X') {
            System.out.println(player_name + " colidiu com uma zona de restrição");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == '?') {
            System.out.println(player_name + " armazenou um item");
            board[row][col] = " ";
            board[row][new_col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[1] = new_col;
            setStoredItem();
          }
        } else {
          System.out.println(player_name + " saiu do tabuleiro!");
          board[row][col] = " ";
        }
        break;
      }
      // Move West / Left (decrease col one unity)
      case "A": {
        int new_col = col - 1;

        if (checkInsideBoard(row, new_col)) {
          String piece_name = board[row][new_col];
          if (piece_name == " ") {
            board[row][col] = " ";
            board[row][new_col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[1] = new_col;

          } else if (piece_name.charAt(initial_name_position) == 'J') {
            System.out.println("Ops, existe outro jogador nessa posição");
          } else if (piece_name.charAt(initial_name_position) == 'F') {
            System.out.println(player_name + " colidiu com uma fake news");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == 'X') {
            System.out.println(player_name + " colidiu com uma zona de restrição");
            board[row][col] = " ";
          } else if (piece_name.charAt(initial_name_position) == '?') {
            System.out.println(player_name + " armazenou um item");
            board[row][col] = " ";
            board[row][new_col] = Cores.ANSI_GREEN + player_name
                + Cores.ANSI_RESET;
            this.current_position[1] = new_col;
            setStoredItem();
          }
        } else {
          System.out.println(player_name + " saiu do tabuleiro!");
          board[row][col] = " ";
        }
        break;
      }
    }

  }
}
