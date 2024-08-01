<h1>Implement Stack and Queue using Deque</h1>
<div class="text" style="height: auto; overflow: unset; mask-image: none;">
                                                                <p dir="ltr"><span>Deque also known as </span><b><strong>double ended queue</strong></b><span>, as name suggests is a special kind&nbsp;of queue in which insertions and deletions can be done at the last as well&nbsp;as at the beginning.</span></p>

<p dir="ltr"><span>A link-list representation of deque is such that each node points to the next&nbsp;node as well as the previous node. So that insertion and deletions take constant&nbsp;time at both the beginning and the last.</span></p><div id="GFG_AD_gfg_mobile_336x280" style="margin: 5px 0;" data-lazy-loading="true"></div>

<p dir="ltr" style="text-align: center;"><img height="inherit" src="https://media.geeksforgeeks.org/wp-content/uploads/deque-1.png" width="inherit"></p>

<p dir="ltr"><span>Now, deque can be used to implement a stack and queue. One simply needs to&nbsp;understand how deque can made to work as a stack or a queue.</span></p><div id="_GFG_ABP_Incontent_728x90" style="text-align:center;"></div><div style="text-align: center; margin: 20px 0px; max-height: 280px; min-height: 0px; display: flex; justify-content: center; flex-wrap: wrap; gap: 1.5em;" id="GFG_AD_InContent_Desktop_728x280"><div id="GFG_AD_InContent_Desktop_350x250_1" style="width: 320px;"></div><div id="GFG_AD_InContent_Desktop_350x250_2" style="width: 320px;"></div></div>

<p dir="ltr"><span>The functions of deque to tweak them to work as stack and queue are list below.</span></p>

<p dir="ltr" style="text-align: center;"><img height="inherit" loading="lazy" src="https://media.geeksforgeeks.org/wp-content/uploads/stack-and-queue-using-deque.png" width="inherit"></p>

<p dir="ltr"><b><strong>Examples: Stack</strong></b><span>&nbsp;</span></p>

<pre><span>Input : Stack : 1 2 3</span><br><span>        Push(4)</span><br><span>Output : Stack : 1 2 3 4</span><br><br><span>Input : Stack : 1 2 3</span><br><span>        Pop()</span><br><span>Output : Stack : 1 2</span><br></pre><p dir="ltr"><br><b><strong>Examples: Queue</strong></b><span>&nbsp;</span></p>

<pre><span>Input: Queue : 1 2 3</span><br><span>       Enqueue(4)</span><br><span>Output: Queue : 1 2 3 4</span><br><br><span>Input: Queue : 1 2 3</span><br><span>       Dequeue()</span><br><span>Output: Queue : 2 3</span><br></pre>
