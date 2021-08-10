// 格式：分两部分，首先是好用的操作，接着是Algo算法模板（含前缀树等DS）。
// Arrays
Arrays.sort(A);
// List
List<Integer> list = new LinkedList<>();
Collections.sort(list, new MyComparator())
private MyComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    return o1 - o2; // myStr1.compareTo(myStr2)
  }
}
// PriorityQueue
PriorityQueue<> pq = new PriorityQueue<>(new MyComparator());

===============================================================

// Java - 前缀和模板
// prefixSum[i] = 前i个数字之和
// int[] prefixSum = getPrefixSum(A);
private int[] getPrefixSum(int[] A) {
  int[] p = new int[A.length + 1];
  p[0] = 0;
  for (int i = 0; i < A.length; i++) {
    p[i+1] = A[i] + p[i];
  }

  return p;
}

// Java - 同向双指针模板
// int n = xxx.length;
// int sum = 0;
for (int i = 0, j = 0; i < n; i++) {
  while (j < n && (i, j的搭配不满足条件)) {
    // TODO: 加上j
    j++;
  }

  if (i, j的搭配满足条件) {
    // TODO: 处理i, j的这次搭配
  }

  // TODO: 去掉i，为下一步准备
}

// Java - 普通BFS模版
// 定义数据结构
Queue<Integer> queue = new LinkedList<>();
HashSet<Integer> visited = new HashSet<>();
// 初始点入队
queue.offer(0);
visited.add(0);
while (!queue.isEmpty()) {
  int now = queue.poll(); // 弹出队首
  // foreach 邻居
  for (int next : findNext(now)) {
    // 若不满足条件，跳过
    if (!isValid(next)) {
      continue;
    }
    // 若满足条件，入队同时更新visited
    queue.offer(next);
    visited.add(next);
  }
}
// PS: 这里要注意，必须在点入队时进行更新，否则会导致相同点的重复入队。考虑(0,0)，每次只能往下和往右走，(1,1)会入队两次。

// DFS 模板
private void dfs() {  // 要点1： 常用visited数组来记录进度。
  if (到达最后一站（例如遍历到最后一个城市，或者树的DFS到了叶子节点）) {
    // 根据题意记录答案
    return;
  }
  if (越界等不合法状态) {
    return;
  }
  if (需要剪枝) {
    return;
  }
  for (拓展所有可能的neighbour/ next step，foreach或者fori等等) {
    if (visited[i]) {continue;} //可选常用visited数组来跳过已访问情况。
    修改参数们（例如经典的visited数组 e.g. visited[i] = true;）
    dfs(... bla bla);
    还原参数们（例如经典的visited数组 e.g. visited[i] = false;）
  }
  return; //一般不需要返回值，除了分治等少数情况。
}

// ADS - 高级数据结构
// Approach #1 - Trie - Data Structure implementation.
// T O(h) for all the 3 searching functions, given that h is the height of the tree.
public class Trie {
  private TrieNode root;
  public Trie() {
    // do intialization if necessary
    root = new TrieNode();
  }

  /*
   * @param word: a word
   * @return: nothing
   */
  public void insert(String word) {
    // write your code here
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (!node.sons.containsKey(letter)) {
        node.sons.put(letter, new TrieNode());
      }
      node = node.sons.get(letter);
    }
    node.word = word;
    node.isWord = true;
  }

  /*
   * @param word: A string
   * @return: if the word is in the trie.
   */
  public boolean search(String word) {
    // write your code here
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (!node.sons.containsKey(letter)) {
        return false;
      }
      node = node.sons.get(letter);
    }
    return node.isWord;
  }

  /*
   * @param prefix: A string
   * @return: if there is any word in the trie that starts with the given prefix.
   */
  public boolean startsWith(String prefix) {
    // write your code here
    TrieNode node = root;
    for (int i = 0; i < prefix.length(); i++) {
      char letter = prefix.charAt(i);
      if (!node.sons.containsKey(letter)) {
        return false;
      }
      node = node.sons.get(letter);
    }
    return true;
  }

  private class TrieNode {
    public String word;
    public boolean isWord;
    public Map<Character, TrieNode> sons;

    public TrieNode() {
      this.word = null;
      this.isWord = false;
      sons = new HashMap<>();
    }

    public TrieNode(String word, boolean isWord) {
      this.word = word;
      this.isWord = isWord;
      sons = new HashMap<>();
    }
  }
}

// References:
https://docs.oracle.com/javase/8/docs/api/index.html
https://docs.oracle.com/en/java/javase/11/docs/api/index.html
