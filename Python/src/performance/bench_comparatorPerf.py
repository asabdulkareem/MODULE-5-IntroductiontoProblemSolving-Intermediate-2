"""pyperf benchmarks for comparatorPerf sorting functions.

Run from the repository root with:

    python -m src.performance.bench_comparatorPerf

Or run pyperf directly:

    python -m pyperf run --bench-module src.performance.bench_comparatorPerf

"""
import pyperf

from src.performance.comparatorPerf import (
    random_word_list,
    sort_by_length,
    sort_by_last_letter,
    sort_b_name,
)


def _make_data(size=10000, min_len=3, max_len=10):
    return random_word_list(size, min_len=min_len, max_len=max_len)


def bench_sort_by_length(runner, size=10000):
    data = _make_data(size)
    runner.bench_func(f"sort_by_length_{size}", lambda: sort_by_length(list(data)))


def bench_sort_by_last_letter(runner, size=10000):
    data = _make_data(size)
    runner.bench_func(f"sort_by_last_letter_{size}", lambda: sort_by_last_letter(list(data)))

def bench_sort_by_name(runner, size=10000):
    data = _make_data(size)
    return runner.bench_func(f"sort_by_name_{size}", lambda: sort_b_name(list(data)))

def main():
    runner = pyperf.Runner()
    # Benchmark two sizes to observe scaling
    for size in (1000, 10000):
        bench_sort_by_length(runner, size=size)
        bench_sort_by_last_letter(runner, size=size)


if __name__ == '__main__':
    main()

