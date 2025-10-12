# Contributing to KMP-Amplitude

Thank you for your interest in contributing to KMP-Amplitude! We welcome contributions from the community.

## How to Contribute

### Reporting Bugs

If you find a bug, please create an issue on GitHub with:

- A clear, descriptive title
- Steps to reproduce the issue
- Expected behavior
- Actual behavior
- Your environment details (Kotlin version, platform, OS)
- Any relevant code snippets or error messages

### Suggesting Enhancements

We welcome suggestions for new features! Please create an issue with:

- A clear description of the enhancement
- Use cases and benefits
- Any implementation ideas you might have
- Specify tags

### Pull Requests

1. **Fork the repository** and create your branch from `main`

2. **Setup your development environment**
   ```bash
   git clone https://github.com/onexeor/kmp-amplitude.git
   cd kmp-amplitude
   ```

3. **Make your changes**
    - Write clear, readable code
    - Follow Kotlin coding conventions
    - Add comments for complex logic
    - Update documentation if needed

4. **Test your changes**
    - Ensure all existing tests pass
    - Add tests for new functionality
    - Test on both Android and iOS if possible

5. **Commit your changes**
    - Use clear, descriptive commit messages
    - Follow the format: `type: description`
    - Types: `feat`, `fix`, `docs`, `style`, `refactor`, `test`, `chore`

   Examples:
   ```
   feat: add support for revenue tracking
   fix: resolve crash on iOS when properties are null
   docs: improve README installation instructions
   ```

6. **Push to your fork** and submit a pull request
   - PR titles should follow [conventional commit standards](https://www.conventionalcommits.org/en/v1.0.0/).

7. **Wait for review**
    - A maintainer will review your PR
    - Address any feedback or requested changes
    - Once approved, your PR will be merged!

## Development Guidelines

### Code Style

- Follow [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Keep functions small and focused
- Add KDoc comments for public APIs

### Project Structure

```
kmp-amplitude/
├── src/
│   ├── commonMain/       # Shared Kotlin code
│   ├── androidMain/      # Android-specific implementation
│   └── iosMain/          # iOS-specific implementation
```

### Testing

- Write unit tests for new features
- Ensure tests pass on all platforms
- Aim for good code coverage

### Documentation

- Update README.md for user-facing changes
- Update CHANGELOG.md with your changes
- Add KDoc comments for new public APIs
- Include code examples for new features

## Building the Project

```bash
# Build the library
./gradlew build

# Run tests
./gradlew test

# Build iOS framework
./gradlew :kmp-amplitude:linkDebugFrameworkIos
```

## Pull Request Checklist

Before submitting your PR, ensure:

- [ ] Code follows project style guidelines
- [ ] All tests pass
- [ ] New functionality includes tests
- [ ] Documentation is updated
- [ ] CHANGELOG.md is updated
- [ ] Commit messages are clear
- [ ] No unnecessary files are included

## Code of Conduct

### Our Standards

- Be respectful and inclusive
- Welcome newcomers and help them learn
- Focus on constructive feedback
- Accept responsibility for mistakes
- Prioritize what's best for the community

### Unacceptable Behavior

- Harassment or discriminatory language
- Trolling or insulting comments
- Public or private harassment
- Publishing others' private information
- Other conduct inappropriate in a professional setting

## Questions?

Feel free to reach out:
- Open a [GitHub Discussion](https://github.com/OneXeor/kmp-amplitude/discussions)
- Create an [Issue](https://github.com/OneXeor/kmp-amplitude/issues) for specific questions

## License

By contributing, you agree that your contributions will be licensed under the same license as the project (MIT License).

Thank you for contributing! 🎉