<h2>Stage 3/6: Enough coffee for everyone</h2>

<h2>Description</h2>

<p>A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.</p>

<p>In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.</p>

<p>If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".</p>

<p>Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.</p>

<h2>Instruction</h2>

<p>Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.</p>

<h2>Examples</h2>

<p>The program should firstly request for water, then milk, then beans, then amount of cups.<br>
The symbol <code class="java">&gt;</code> represents the user input. Notice that it's not the part of the input.</p>

<p><strong>Example 1</strong></p>

<pre><code class="language-no-highlight">Write how many ml of water the coffee machine has: 
&gt; 300
Write how many ml of milk the coffee machine has: 
&gt; 65
Write how many grams of coffee beans the coffee machine has: 
&gt; 100
Write how many cups of coffee you will need: 
&gt; 1
Yes, I can make that amount of coffee</code></pre>

<p><strong>Example 2 </strong></p>

<pre><code class="language-no-highlight">Write how many ml of water the coffee machine has: 
&gt; 500
Write how many ml of milk the coffee machine has: 
&gt; 250
Write how many grams of coffee beans the coffee machine has: 
&gt; 200
Write how many cups of coffee you will need: 
&gt; 10
No, I can make only 2 cup(s) of coffee</code></pre>

<p><strong>Example 3 </strong></p>

<pre><code class="language-no-highlight">Write how many ml of water the coffee machine has: 
&gt; 1550
Write how many ml of milk the coffee machine has: 
&gt; 299
Write how many grams of coffee beans the coffee machine has: 
&gt; 300
Write how many cups of coffee you will need: 
&gt; 3
Yes, I can make that amount of coffee (and even 2 more than that)</code></pre>

<p><strong>Example 4</strong></p>

<pre><code class="language-no-highlight">Write how many ml of water the coffee machine has: 
&gt; 0
Write how many ml of milk the coffee machine has: 
&gt; 0
Write how many grams of coffee beans the coffee machine has: 
&gt; 0
Write how many cups of coffee you will need: 
&gt; 1
No, I can make only 0 cup(s) of coffee</code></pre>

<p><strong>Example 5</strong></p>

<pre><code class="language-no-highlight">Write how many ml of water the coffee machine has: 
&gt; 0
Write how many ml of milk the coffee machine has: 
&gt; 0
Write how many grams of coffee beans the coffee machine has: 
&gt; 0
Write how many cups of coffee you will need: 
&gt; 0
Yes, I can make that amount of coffee </code></pre>

<p><strong>Example 6</strong></p>

<pre><code class="language-no-highlight">Write how many ml of water the coffee machine has: 
&gt; 200
Write how many ml of milk the coffee machine has: 
&gt; 50
Write how many grams of coffee beans the coffee machine has: 
&gt; 15
Write how many cups of coffee you will need: 
&gt; 0
Yes, I can make that amount of coffee (and even 1 more than that)</code></pre>