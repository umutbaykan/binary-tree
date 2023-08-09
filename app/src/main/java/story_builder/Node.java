package story_builder;

public class Node {
  
  String story;
  Node left;
  Node right;

  public Node(String story) {
    this.story = story;
    left = null;
    right = null;
  }
}
