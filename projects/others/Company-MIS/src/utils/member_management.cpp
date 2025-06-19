#include "include/member.hpp"
#include <fstream>
#include <iostream>
#include <vector>

void addMember(const Member& member) {
    std::ofstream file("data/members.txt", std::ios::app);
    if (file.is_open()) {
        file << member.id << "," << member.name << "," << member.phone << "," << member.motorcycle << "," << member.date_joined << "\n";
        file.close();
        std::cout << "Member added successfully.\n";
    } else {
        std::cerr << "Unable to open file for writing.\n";
    }
}

void displayAllMembers() {
    std::ifstream file("data/members.txt");
    if (file.is_open()) {
        std::string line;
        while (getline(file, line)) {
            std::cout << line << "\n";
        }
        file.close();
    } else {
        std::cerr << "Unable to open file for reading.\n";
    }
}

bool updateMember(int id, const Member& member) {
    std::ifstream file("data/members.txt");
    if (!file.is_open()) {
        return false;
    }

    std::ofstream tempFile("data/temp_members.txt", std::ios::app);
    if (!tempFile.is_open()) {
        file.close();
        return false;
    }

    bool found = false;
    std::string line;
    while (getline(file, line)) {
        size_t commaPos = line.find(',');
        int existingId = std::stoi(line.substr(0, commaPos));
        if (existingId == id) {
            tempFile << member.id << "," << member.name << "," << member.phone << "," << member.motorcycle << "," << member.date_joined << "\n";
            found = true;
        } else {
            tempFile << line << "\n";
        }
    }

    file.close();
    tempFile.close();

    if (found) {
        remove("data/members.txt");
        rename("data/temp_members.txt", "data/members.txt");
        std::cout << "Member updated successfully.\n";
    } else {
        std::remove("data/temp_members.txt");
        std::cout << "Member not found.\n";
    }

    return found;
}

bool deleteMember(int id) {
    std::ifstream file("data/members.txt");
    if (!file.is_open()) {
        return false;
    }

    std::ofstream tempFile("data/temp_members.txt", std::ios::app);
    if (!tempFile.is_open()) {
        file.close();
        return false;
    }

    bool found = false;
    std::string line;
    while (getline(file, line)) {
        size_t commaPos = line.find(',');
        int existingId = std::stoi(line.substr(0, commaPos));
        if (existingId == id) {
            found = true;
        } else {
            tempFile << line << "\n";
        }
    }

    file.close();
    tempFile.close();

    if (found) {
        remove("data/members.txt");
        rename("data/temp_members.txt", "data/members.txt");
        std::cout << "Member deleted successfully.\n";
    } else {
        std::remove("data/temp_members.txt");
        std::cout << "Member not found.\n";
    }

    return found;
}
