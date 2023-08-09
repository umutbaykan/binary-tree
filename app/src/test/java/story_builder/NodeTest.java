package story_builder;

import org.junit.Test;
import org.junit.Assert;

public class NodeTest {
  @Test
  public void TestNodeInitiation() {
    Node storyNode = new Node("You see a cave, what do you do?");
    Assert.assertEquals("You see a cave, what do you do?", storyNode.story);
  }

  @Test
  public void TestNodeLeftChildAddress() {
    Node leftNode = new Node("hi, i'm left");
    Node rightNode = new Node("right");
    Node storyNode = new Node("abc");
    storyNode.left = leftNode;
    storyNode.right = rightNode;
    Assert.assertEquals(rightNode, storyNode.right);
    Assert.assertEquals(leftNode, storyNode.left);
  }
}
