pivot = (arr, start = 0, end = arr.length + 1) => {
  swap = (array, i, j) => {
    var temp = array[i];
    array[i] = arr[j];
    array[j] = temp;
  };
  let pivot = arr[start];
  let swapIdx = start;
  for (var i = start + 1; i < arr.length; i++) {
    if (pivot > arr[i]) {
      swapIdx++;
      swap(arr, swapIdx, i);
    }
  }
  swap(arr, start, swapIdx);

  return swapIdx;
};

quickSort = (arr, left = 0, right = arr.length - 1) => {
  if (left < right) {
    let pivotidx = pivot(arr, left, right);
    quickSort(arr, left, pivotidx - 1);
    quickSort(arr, pivotidx + 1, right);
  }
  return arr;
};
