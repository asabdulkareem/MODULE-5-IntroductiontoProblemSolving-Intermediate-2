import random
import string


def random_word(min_len=3, max_len=10):
	length = random.randint(min_len, max_len)
	return ''.join(random.choice(string.ascii_lowercase) for _ in range(length))


def random_word_list(n, min_len=3, max_len=10):
	return [random_word(min_len, max_len) for _ in range(n)]


def sort_by_length(words):
	return sorted(words, key=len)


def sort_by_last_letter(words):
	return sorted(words, key=lambda x: x[-1])

def sort_b_name(words):
	return sorted(words, key=str.lower)

if __name__ == '__main__':
	words = ["banana", "pie", "apple"]
	# Sort by length
	print(sort_by_length(words))
	# Sort by last letter
	print(sort_by_last_letter(words))
