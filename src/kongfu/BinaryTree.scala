package kongfu

/**
 * Created by calvinliu on 7/6/2016.
 */
object BinaryTree {
  def inOrder[T](root: Option[TreeNode[T]], f: TreeNode[T] => Unit): Unit = root match {
    case None =>
    case Some(x) =>
      if (x.left != None) inOrder(x.left, f)
      f(x)
      if (x.right != None) inOrder(x.right, f)
  }

  def main(args: Array[String]) {

  }
}

case class TreeNode[T](
                        value: T,
                        left: Option[TreeNode[T]],
                        right: Option[TreeNode[T]]
                        )

