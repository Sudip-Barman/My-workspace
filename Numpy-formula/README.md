````markdown
# NumPy Cheat Sheet 🧮

> A beginner-friendly guide to the most commonly used NumPy functions with explanations and examples.

---

## 📚 Table of Contents

- [What is NumPy?](#-what-is-numpy)
- [Installation](#-installation)
- [Import NumPy](#-import-numpy)
- [Array Creation](#1-array-creation)
- [Array Information](#2-array-information)
- [Reshaping Arrays](#3-reshaping-arrays)
- [Mathematical Functions](#4-mathematical-functions)
- [Statistical Functions](#5-statistical-functions)
- [Trigonometric Functions](#6-trigonometric-functions)
- [Logarithmic Functions](#7-logarithmic-functions)
- [Random Module](#8-random-module)
- [Sorting & Searching](#9-sorting--searching)
- [Joining Arrays](#10-joining-arrays)
- [Splitting Arrays](#11-splitting-arrays)
- [Linear Algebra](#12-linear-algebra)
- [Utility Functions](#13-utility-functions)
- [Most Important Functions](#-most-important-functions)
- [Resources](#-resources)

---

# 📖 What is NumPy?

**NumPy (Numerical Python)** is the most popular Python library for numerical computing.

It provides:

- 🚀 Fast multidimensional arrays
- ➕ Mathematical operations
- 📊 Statistical functions
- 🎲 Random number generation
- 📐 Linear algebra
- 🤖 Foundation for Data Science and Machine Learning

---

# 📦 Installation

```bash
pip install numpy
````

---

# 📥 Import NumPy

```python
import numpy as np
```

---

# 1. Array Creation

| Function        | Description                                     |
| --------------- | ----------------------------------------------- |
| `np.array()`    | Create an array from a Python list or tuple     |
| `np.zeros()`    | Create an array filled with zeros               |
| `np.ones()`     | Create an array filled with ones                |
| `np.empty()`    | Create an uninitialized array                   |
| `np.full()`     | Create an array filled with a specific value    |
| `np.arange()`   | Create evenly spaced values                     |
| `np.linspace()` | Create evenly spaced values between two numbers |
| `np.logspace()` | Create logarithmically spaced values            |
| `np.eye()`      | Create an identity matrix                       |
| `np.diag()`     | Create or extract a diagonal                    |

### Example

```python
import numpy as np

a = np.array([1,2,3])

b = np.zeros((2,3))

c = np.ones((3,3))

d = np.arange(1,10,2)

e = np.linspace(0,1,5)
```

---

# 2. Array Information

| Function   | Description                    |
| ---------- | ------------------------------ |
| `ndim`     | Number of dimensions           |
| `shape`    | Shape of the array             |
| `size`     | Total number of elements       |
| `dtype`    | Data type                      |
| `itemsize` | Memory occupied by one element |

### Example

```python
a = np.array([[1,2],[3,4]])

print(a.ndim)

print(a.shape)

print(a.size)

print(a.dtype)
```

---

# 3. Reshaping Arrays

| Function      | Description                      |
| ------------- | -------------------------------- |
| `reshape()`   | Change array shape               |
| `flatten()`   | Convert array into one dimension |
| `ravel()`     | Efficient flattening             |
| `transpose()` | Transpose matrix                 |
| `T`           | Shortcut for transpose           |
| `resize()`    | Resize array                     |

### Example

```python
a = np.arange(6)

print(a.reshape(2,3))

print(a.flatten())

print(a.T)
```

---

# 4. Mathematical Functions

| Function        | Description      |
| --------------- | ---------------- |
| `np.add()`      | Addition         |
| `np.subtract()` | Subtraction      |
| `np.multiply()` | Multiplication   |
| `np.divide()`   | Division         |
| `np.power()`    | Raise to a power |
| `np.sqrt()`     | Square root      |
| `np.abs()`      | Absolute value   |
| `np.round()`    | Round numbers    |

### Example

```python
np.add(5,3)

np.subtract(10,5)

np.multiply(4,6)

np.divide(10,2)

np.power(2,5)

np.sqrt(25)
```

---

# 5. Statistical Functions

| Function      | Description        |
| ------------- | ------------------ |
| `np.mean()`   | Mean               |
| `np.median()` | Median             |
| `np.std()`    | Standard deviation |
| `np.var()`    | Variance           |
| `np.sum()`    | Sum                |
| `np.prod()`   | Product            |
| `np.min()`    | Minimum            |
| `np.max()`    | Maximum            |

### Example

```python
a = np.array([1,2,3,4,5])

print(np.mean(a))

print(np.median(a))

print(np.std(a))

print(np.sum(a))
```

---

# 6. Trigonometric Functions

| Function       | Description                |
| -------------- | -------------------------- |
| `np.sin()`     | Sine                       |
| `np.cos()`     | Cosine                     |
| `np.tan()`     | Tangent                    |
| `np.arcsin()`  | Inverse sine               |
| `np.arccos()`  | Inverse cosine             |
| `np.arctan()`  | Inverse tangent            |
| `np.degrees()` | Convert radians to degrees |
| `np.radians()` | Convert degrees to radians |

### Example

```python
np.sin(np.pi/2)

np.cos(0)

np.tan(np.pi/4)
```

---

# 7. Logarithmic Functions

| Function     | Description       |
| ------------ | ----------------- |
| `np.log()`   | Natural logarithm |
| `np.log10()` | Base-10 logarithm |
| `np.log2()`  | Base-2 logarithm  |
| `np.exp()`   | Exponential (eˣ)  |

### Example

```python
np.log(10)

np.log10(100)

np.log2(8)

np.exp(2)
```

---

# 8. Random Module

| Function              | Description                             |
| --------------------- | --------------------------------------- |
| `np.random.rand()`    | Random decimal numbers                  |
| `np.random.randint()` | Random integers                         |
| `np.random.randn()`   | Random numbers from normal distribution |
| `np.random.choice()`  | Random selection                        |
| `np.random.shuffle()` | Shuffle an array                        |
| `np.random.seed()`    | Set random seed                         |

### Example

```python
np.random.randint(1,10)

np.random.choice([10,20,30])

np.random.shuffle(a)
```

---

# 9. Sorting & Searching

| Function       | Description            |
| -------------- | ---------------------- |
| `np.sort()`    | Sort array             |
| `np.argsort()` | Return sorted indices  |
| `np.where()`   | Conditional search     |
| `np.argmax()`  | Index of maximum value |
| `np.argmin()`  | Index of minimum value |

### Example

```python
np.sort(a)

np.where(a > 3)

np.argmax(a)
```

---

# 10. Joining Arrays

| Function           | Description         |
| ------------------ | ------------------- |
| `np.concatenate()` | Join arrays         |
| `np.stack()`       | Stack arrays        |
| `np.vstack()`      | Vertical stacking   |
| `np.hstack()`      | Horizontal stacking |

### Example

```python
np.concatenate((a,b))

np.vstack((a,b))

np.hstack((a,b))
```

---

# 11. Splitting Arrays

| Function           | Description          |
| ------------------ | -------------------- |
| `np.split()`       | Split arrays equally |
| `np.array_split()` | Flexible splitting   |
| `np.hsplit()`      | Horizontal split     |
| `np.vsplit()`      | Vertical split       |

### Example

```python
np.split(a,2)
```

---

# 12. Linear Algebra

| Function            | Description                  |
| ------------------- | ---------------------------- |
| `np.dot()`          | Dot product                  |
| `np.matmul()`       | Matrix multiplication        |
| `np.linalg.det()`   | Determinant                  |
| `np.linalg.inv()`   | Matrix inverse               |
| `np.linalg.eig()`   | Eigenvalues and eigenvectors |
| `np.linalg.solve()` | Solve linear equations       |

### Example

```python
np.dot(a,b)

np.matmul(a,b)

np.linalg.det(matrix)

np.linalg.inv(matrix)
```

---

# 13. Utility Functions

| Function      | Description                 |
| ------------- | --------------------------- |
| `np.unique()` | Return unique values        |
| `np.clip()`   | Limit values within a range |
| `np.repeat()` | Repeat elements             |
| `np.tile()`   | Repeat arrays               |
| `np.isnan()`  | Check NaN values            |
| `np.isinf()`  | Check Infinity              |

### Example

```python
np.unique(a)

np.clip(a,0,10)

np.repeat(a,2)
```

---

# ⭐ Most Important Functions

If you're a beginner, master these first:

```python
array()
zeros()
ones()
arange()
linspace()

shape
ndim
dtype

reshape()
flatten()

sum()
mean()
median()
min()
max()

sort()
where()

concatenate()
split()

random.randint()
random.choice()

dot()
matmul()
```

These functions cover nearly **80% of real-world NumPy usage** in Data Science, Machine Learning, Scientific Computing, and Python development.

---

# 📚 Resources

* Official NumPy Documentation: https://numpy.org/doc/
* NumPy GitHub Repository: https://github.com/numpy/numpy

---

## ⭐ Support

If this repository helps you, consider giving it a ⭐ on GitHub.

Happy Coding! 🚀

```
```
