<h2>Stage 5/6: On a coffee loop</h2>

<h2>Description</h2>

<p>But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit". Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has.</p>

<p>Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee.</p>

<p>And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, he should be able to type "back" to return into the main cycle.</p>

<p>Remember, that:</p>

<ul>
	<li>For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.</li>
	<li>For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.</li>
	<li>And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.</li>
</ul>

<h2>Instruction</h2>

<p>Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.</p>

<h2>Example</h2>

<p>Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash).<br>
The symbol <code class="java">&gt;</code> represents the user input. Notice that it's not the part of the input.</p>

<pre><code class="language-no-highlight">Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
&gt; buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
&gt; 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
50 of water
465 of milk
100 of coffee beans
8 of disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
&gt; buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
&gt; 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit): 
&gt; fill

Write how many ml of water do you want to add: 
&gt; 1000
Write how many ml of milk do you want to add: 
&gt; 0
Write how many grams of coffee beans do you want to add: 
&gt; 0
Write how many disposable cups of coffee do you want to add: 
&gt; 0

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
1050 of water
465 of milk
100 of coffee beans
8 of disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
&gt; buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
&gt; 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit): 
&gt; take

I gave you $564

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
0 of money

Write action (buy, fill, take, remaining, exit): 
&gt; exit</code></pre>