/* Simple Hello World in Node.js */
var LRU = capacity => {
  this.capacity = capacity;
  this.map = new Map();
};

LRU.put = (key, value) => {
  if (this.capacity > this.map.size) {
    this.map.set(key, value);
  } else {
    this.map.delete(this.map.keys().next().value);
    this.map.set(key, value);
  }
};

LRU.get = key => {
  if (!this.map.has(key)) return -1;
  let v = this.map.get(key);

  this.map.delete(key);
  this.map.set(key, v);
  return this.map.get(key);
};

LRU.show = () => {
  for (var [key, value] of this.map.entries()) {
    console.log(key, value);
  }
};

LRU(3);
LRU.put(1, 2);
LRU.put(2, 3);
LRU.put(3, 2);
LRU.show();
LRU.put(4, 2);
LRU.show();
