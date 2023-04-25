//妙到颠毫
//其实二叉搜索树就是按中序遍历方向递增的数列
//保证一个数在其正位，只需要判断这个数要比一个数大比一个数小。
//而这两个条件其实就由向左向右两个箭头传递
//这个程序每次遍历都同时更新上下限，属实是精微
//可能是我很难理解树型与数组的关系，所以理解起来很困难吧
//感觉数据本身存在意义，数据的位置意义更大

public class 判断二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;
        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
        if (!isValidBST(node.left, lower, val)) return false;
        if (!isValidBST(node.right, val, upper)) return false;
        return true;
    }
}