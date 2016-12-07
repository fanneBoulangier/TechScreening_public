# Exercises for Technical Screening purposes of potential Cegeka developers

## READ THIS BEFORE CLONING!!!
All the .zip files are committed using [Git LFS](https://git-lfs.github.com/). So if you actually want that content, you first need to download the [Git LFS cli extension](https://git-lfs.github.com/).

## Pointers for Recruiters
We've done some playtesting with (a diverse set of) colleagues to see what we might come across, and this pointer list is what we learned from that.

### A Typical Schedule might look like this

| Time  | Action |
| ----  | ------ |
| 10:00 | Meet recruit |
| 10:05 | Explain format (maybe show this table) |
| 10:10 | Candidate starts Message sending exercise |
| 10:25 | Recruiter walks in and start pairing |
| 11:00 | Explain refactoring exercise and recruiter leaves room |
| 11:05 | Recruit reads code to figure our how to refactor |
| 11:10 | Recruiter enters room and asks what recruit would refactor etc. |
| 11:30 | Recruiter brings in HR and start personality questions |
| 12:00 | Recruiter & HR give feedback to recruit |

### Pointer 1
Make sure they understand that for the first exercise, they should be writing code as if they're on a real project. So they can modify any class they want as well.

Maybe tell them _Write code like you would write production code for an important project with lots of developer rotation_.

Also tell them that we don't expect them to finish all the stories in 15 minutes, and that we will be joining them to pair on the stories in 15 minutes.

So that they don't make the excuse of _Well I could have written Unit Tests, but I was under time pressure and wanted to implement all stories asap. That's also why I have shitty design._

Also explain that for the first exercise, the MessageSender is something that they _can_ change if they want, but that `acceptMessage` is not a method they should implement. See below

### Pointer 2
When you enter in the first exercise, and notice they haven't added any Unit Tests, ask them if they've ever heard of that.

Start writing Unit Tests while pairing, like we would on a real project and check how they react (when first writing a test before implementation).

### Pointer 3
When they haven't finished Story 4 and 5, still try to ask about how they would implement those stories.

### Pointer 4
Explain that they can use git if they want to (just have a local git init, no remote).

## Exercise 1 - Design Choices
### No ubiquitous language
You might notice that there's no real ubiquitous language in there, e.g. _forward to inbox_ vs. _categorize_, this is on purpose.

Also, the domain looks quite a lot like email forwarding, but we never use that word because we wanted to maintain the abstraction.

### No MessageSender implementation
There is one in the Unit Tests though.

We wanted to make it clear that the MessageSender is something you, as a recruit, don't need to worry about exactly what it does.

We also did not want to infer _Dependency Injection_ on our `Inbox` class, so that a recruit can tell us about that if he/she wants to.
