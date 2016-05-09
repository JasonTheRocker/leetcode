https://leetcode.com/problems/min-stack/

The challenge of this question is to get the new min once the current min poped out.

The idea of this solution is to always push a copy of the second smallest value before we push in a new min value.

In case of a push
	if we have a new min
		push the old min
		set min to value
	push the value

By doing push this way, we can guarantee that the next min can always be find with a pop right after the current min getting poped.

Time complexity is constant for any calls.
Space complexity is up to 2N (where N is the total number of elements).
